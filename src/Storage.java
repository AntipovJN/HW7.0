import java.util.Arrays;

public class Storage<K, V> {

    private static final int INITIAL_CAPACITY = 10;
    private K[] keys;
    private V[] values;
    private int lengthOfStorage;
    private int lastIndex;

    public Storage() {
        keys = (K[]) new Object[INITIAL_CAPACITY];
        values = (V[]) new Object[INITIAL_CAPACITY];
        lengthOfStorage = INITIAL_CAPACITY;
        lastIndex = 0;
    }

    public Storage(int capacity) {
        keys = (K[]) new Object[capacity];
        values = (V[]) new Object[capacity];
        lengthOfStorage = capacity;

        lastIndex = 0;
    }

    public void put(K key, V value) {
        if (lastIndex == lengthOfStorage-1) {
            capacityIncrease();
        }
        keys[lastIndex] = key;
        values[lastIndex] = value;
        lastIndex++;
    }

    private void capacityIncrease() {
       int  newLengthOfStorage = lengthOfStorage + (lengthOfStorage >> 1);
        keys = Arrays.copyOf(keys, newLengthOfStorage);
        values = Arrays.copyOf(values, newLengthOfStorage);
        lengthOfStorage = newLengthOfStorage;
    }

    public K[] getAllKeys() {
        return keys;
    }

    public V[] getAllValues() {
        return values;
    }

    public int getLength() {
        return lastIndex;
    }

    public V getValue(K key) {
        int i = 0;
        for (K k : keys) {
            if (key.equals(k)) {
                return values[i];
            }
            i++;
        }
        return null;
    }
}
