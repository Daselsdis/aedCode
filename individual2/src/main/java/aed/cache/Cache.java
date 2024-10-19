package aed.cache;

import es.upm.aedlib.Position;
import es.upm.aedlib.map.*;
import es.upm.aedlib.positionlist.*;

public class Cache<Key, Value> {

    // Tamano de la cache
    private int maxCacheSize;

    // NO MODIFICA ESTOS ATTRIBUTOS, NI CAMBIA SUS NOMBRES: mainMemory,
    // cacheContents, keyListLRU

    // Para acceder a la memoria M
    private Storage<Key, Value> mainMemory;
    // Un 'map' que asocia una clave con un ``CacheCell''
    private Map<Key, CacheCell<Key, Value>> cacheContents;
    // Una PositionList que guarda las claves en orden de
    // uso -- la clave mas recientemente usado sera el keyListLRU.first()
    private PositionList<Key> keyListLRU;

    // Constructor de la cache. Especifica el tamano maximo
    // y la memoria que se va a utilizar
    public Cache(int maxCacheSize, Storage<Key, Value> mainMemory) {
        this.maxCacheSize = maxCacheSize;

        // NO CAMBIA
        this.mainMemory = mainMemory;
        this.cacheContents = new HashTableMap<Key, CacheCell<Key, Value>>();
        this.keyListLRU = new NodePositionList<Key>();
    }

    public void addToLRU(Key key) {// * Adds keys to lru and deals with fropping from cache */
        // Check for dropping keys off the cache
        Key droppedKey = null;
        if (keyListLRU.size() == maxCacheSize) // If size is max, we are due to drop the last Key.
            droppedKey = keyListLRU.remove(keyListLRU.last());
        keyListLRU.addFirst(key); // Now we should be able to add our new Key at the start.

        // Dealing with dropped key
        if (droppedKey != null) { // If we dropped a value (accessed by it's key)
            CacheCell<Key, Value> droppedCell = cacheContents.remove(droppedKey);
            if (droppedCell.getDirty())
                mainMemory.write(droppedKey, droppedCell.getValue());
        }
    }

    // Devuelve el valor que corresponde a una clave "Key"
    public Value get(Key key) {
        // Get value from key off cache or storage (priority cache in case it's dirty)
        Value val = null;
        if (cacheContents.containsKey(key))
            val = cacheContents.get(key).getValue();
        else
            val = mainMemory.read(key);

        if (val != null) { // If key is actually in storage or cache, we may cache something
            // Check for repeating Keys
            boolean repe = false;
            Position<Key> cursorRepe = keyListLRU.first();
            while (cursorRepe != null && !repe) {
                repe = cursorRepe.element().equals(key);
                cursorRepe = keyListLRU.next(cursorRepe);
            }

            if (repe) { // Displace the repe element to the start
                if (cursorRepe != null)// If the cursor when it was found was null, it was last, if not, it was prev
                    keyListLRU.addFirst(keyListLRU.remove(keyListLRU.prev(cursorRepe)));
                else
                    keyListLRU.addFirst(keyListLRU.remove(keyListLRU.last()));

            } else { // It's a new element, we "addToLRU" (manages dropping for us) and simply put it
                addToLRU(key);
                // Either way Add new CacheCell as it is not a repe key
                cacheContents.put(key, new CacheCell<Key, Value>(val, false, null));
                // We do not assign Pos here, Slight optimization, as we will set it again on
                // update all CacheCells' pos trackers.
            }

            // Update all CacheCells' position trackers.
            Position<Key> cursorUpdatePos = keyListLRU.first();
            while (cursorUpdatePos != cursorRepe) { // Untill null if not repe, until touched val if repe
                cacheContents.get(cursorUpdatePos.element()).setPos(cursorUpdatePos);
                cursorUpdatePos = keyListLRU.next(cursorUpdatePos);
            }

        }

        return val;
    }

    // Establece un valor nuevo para la clave en la memoria cache
    public void put(Key key, Value value) {
        // Is modded key in cache?
        boolean found = false;
        Position<Key> cursorFound = keyListLRU.first();
        while (cursorFound != null && !found) {
            found = cursorFound.element().equals(key);
            cursorFound = keyListLRU.next(cursorFound);
        }

        if (!found) { // not cached? cache. already at lru top
            Value val = get(key);
            if (val == null) {
                addToLRU(key);
                cacheContents.put(key, new CacheCell<Key, Value>(val, false, keyListLRU.first()));
            }
        } else { // cached
            // Move to lru top
            if (cursorFound != null) // If the cursor when it was found was null, it's last, if not, it's prev
                keyListLRU.addFirst(keyListLRU.remove(keyListLRU.prev(cursorFound)));
            else
                keyListLRU.addFirst(keyListLRU.remove(keyListLRU.last()));

            // Update all CacheCell's position tracker.
            Position<Key> cursorUpdatePos = keyListLRU.first();
            while (cursorUpdatePos != cursorFound) { // Untill null if not repe, until touched val if repe
                cacheContents.get(cursorUpdatePos.element()).setPos(cursorUpdatePos);
                cursorUpdatePos = keyListLRU.next(cursorUpdatePos);
            }
        }

        // Is new value diff? if so, dirty and set
        cacheContents.get(key).setDirty(cacheContents.get(key).getValue() != value);
        if (cacheContents.get(key).getDirty())
            cacheContents.get(key).setValue(value);
    }

    // NO CAMBIA
    public String toString() {
        return "cache";
    }
}
