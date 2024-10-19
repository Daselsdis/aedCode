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

    // Devuelve el valor que corresponde a una clave "Key"
    public Value get(Key key) {
        // Retrieve value from key off the storage
        Value val = mainMemory.read(key);

        // Check for repeating Keys, else check for dropping
        boolean repe = false;
        Iterator<Key> it = keyListLRU.iterator();
        while (it.hasNext() && !repe)
            repe = it.next() == key;

        if (repe) {
            keyListLRU.addFirst(keyListLRU.remove(it.));
        } else {

            // Check for dropping values off the cache
            Key droppedKey = null;
            if (keyListLRU.size() == maxCacheSize) // If size is max, we are due to drop the last Key.
                droppedKey = keyListLRU.remove(keyListLRU.last());
            keyListLRU.addFirst(key); // Now we should be able to add our new Key at the start.

            // Dealing with dropped values
            if (droppedKey != null) { // If we dropped a value (accessed by it's key)
                CacheCell<Key, Value> droppedCell = cacheContents.remove(droppedKey);
                if (droppedCell.getDirty())
                    mainMemory.write(droppedKey, droppedCell.getValue());
            }
        }

        cacheContents.put(key, new CacheCell<Key, Value>(val, false, keyListLRU.first()));
        // CAMBIA este metodo
        return val;
    }

    // Establece un valor nuevo para la clave en la memoria cache
    public void put(Key key, Value value) {
        // CAMBIA este metodo
    }

    // NO CAMBIA
    public String toString() {
        return "cache";
    }
}
