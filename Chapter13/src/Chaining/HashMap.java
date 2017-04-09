package Chaining;

/**
 * Created by seongwonlee on 2017. 4. 9..
 */
public class HashMap {
    private int tableSize;
    private LinkedHash[] table;

    public HashMap(int tableSize) {
        this.table = new LinkedHash[tableSize];

        for (int i=0; i<table.length; i++) {
            table[i] = null;
        }
    }

    private int setHashFunction(int key) {
        return (key % table.length);
    }

    public String print(int key) {
        int hashValue = setHashFunction(key);

        if (table[hashValue] != null) {
            LinkedHash entry = table[hashValue];

            while (entry != null && entry.getKey() != hashValue) {
                entry = entry.getNext();
            }

            if (entry == null) {
                return null;
            } else {
                return entry.getValue();
            }
        } else {
            return null;
        }
    }

    public void insert(int key, String value) {
        int hashValue = setHashFunction(key);

        if (table[hashValue] == null) {
            table[hashValue] = new LinkedHash(key, value);
        } else {
            LinkedHash entry = table[hashValue];
            while (entry.getNext() != null && entry.getKey() != key) {
                entry = entry.getNext();
            }
            if (entry.getKey() == key) {
                entry.setValue(value);
            } else {
                entry.setNext(new LinkedHash(key, value));
            }
        }
    }

    public void delete(int key) {
        int hashValue = setHashFunction(key);

        if (table[hashValue] != null) {
            LinkedHash prevEntry = null;
            LinkedHash entry = table[hashValue];

            while (entry.getNext() != null && entry.getKey() != key) {
                prevEntry = entry;
                entry = entry.getNext();
            }
            if (entry.getKey() == key) {
                if (prevEntry == null) {
                    table[hashValue] = entry.getNext();
                } else {
                    prevEntry.setNext(entry.getNext());
                }
            }
        }
    }
}
