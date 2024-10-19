package aed.cache;

import java.util.Iterator;

//import java.util.Iterator;

import es.upm.aedlib.Entry;
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

    public Key addToLRU(Key key) {// * Returns dropped key or null, adds key at start */
        Key droppedKey = null;
        if (keyListLRU.size() == maxCacheSize) // If size is max, we are due to drop the last Key.
            droppedKey = keyListLRU.remove(keyListLRU.last());
        keyListLRU.addFirst(key); // Now we should be able to add our new Key at the start.
        return droppedKey;
    }

    // Devuelve el valor que corresponde a una clave "Key"
    public Value get(Key key) {
        // Retrieve value from key off the storage
        Value val = mainMemory.read(key);

        if (val != null) { // If key is actually in storage we may cache something
            // Check for repeating Keys, else check for dropping
            boolean repe = false;
            Position<Key> cursorRepe = keyListLRU.first();
            while (cursorRepe != null && !repe) {
                repe = cursorRepe.element() == key;
                cursorRepe = keyListLRU.next(cursorRepe);
            }

            if (repe) { // Displace the repe element to the start
                if (cursorRepe != null)
                    keyListLRU.addFirst(keyListLRU.remove(keyListLRU.prev(cursorRepe)));
                else
                    keyListLRU.addFirst(keyListLRU.remove(keyListLRU.last()));
            } else {
                // Check for dropping keys off the cache
                Key droppedKey = addToLRU(key);

                // Dealing with dropped key
                if (droppedKey != null) { // If we dropped a value (accessed by it's key)
                    CacheCell<Key, Value> droppedCell = cacheContents.remove(droppedKey);
                    if (droppedCell.getDirty())
                        mainMemory.write(droppedKey, droppedCell.getValue());
                }

                // Either way Add new CacheCell as it is not a repe key
                cacheContents.put(key, new CacheCell<Key, Value>(val, false, keyListLRU.first())); // TODO We do not
                                                                                                   // assign Pos here,
                // opt?
            }

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
        // boolean keyExists = false;
        // Iterator<Entry<Key,Value>> it = mainMemory.entries().iterator();
        // while (it.hasNext() && !keyExists) {
        // keyExists = it.next().getKey() == key;
        // }

        // Is modded key in cache?
        boolean found = false;
        Position<Key> cursorFound = keyListLRU.first();
        while (cursorFound != null && !found) {
            found = cursorFound.element() == key;
            cursorFound = keyListLRU.next(cursorFound);
        }

        if (!found) { // not cached? cache. already at lru top
            Value val = get(key);
            if (val == null) {
                keyListLRU.addFirst(key);
                cacheContents.put(key, new CacheCell<Key, Value>(val, false, keyListLRU.first()));
            }
        } else { // cached. Move to lru top
            if (cursorFound != null)
                keyListLRU.addFirst(keyListLRU.remove(keyListLRU.prev(cursorFound)));
            else
                keyListLRU.addFirst(keyListLRU.remove(keyListLRU.last()));

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

    public static void main(String[] args) {
        Cache<Integer, String> cache = new Cache<Integer, String>(2,
                new Storage<Integer, String>(new Integer[] { 6, 1, 5, 4, 3, 2 },
                        new String[] { "ola", "namaste", "rimaykullayki", "privet", "ciao", "zdravo" }));
        System.out.println(cache.get(6));
        cache.put(6, "hei");
    }
}
