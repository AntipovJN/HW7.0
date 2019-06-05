import java.util.Arrays;

public class Storage<K, V> {

    private final int INITIAL_CAPACITY = 10;
    private K[] keys;
    private V[] values;
    private int lengthOfStorage;
    private int lastIndex;
    private int newLengthOfStorage;

    public Storage() {
        keys = (K[]) new Object[INITIAL_CAPACITY];
        values = (V[]) new Object[INITIAL_CAPACITY];
        lengthOfStorage = INITIAL_CAPACITY;
        newLengthOfStorage = INITIAL_CAPACITY;
        lastIndex = 0;
    }

    public Storage(int capacity) {
        keys = (K[]) new Object[capacity];
        values = (V[]) new Object[capacity];
        lengthOfStorage = capacity;
        newLengthOfStorage = capacity;
        lastIndex = 0;
    }

    public void put(K key, V value) {
        if (keys[lengthOfStorage - 1] != null) {
            capacityIncrease();
        }
        keys[lastIndex] = key;
        values[lastIndex] = value;
        lastIndex++;
    }

    private void capacityIncrease() {
        newLengthOfStorage += lengthOfStorage >> 1;
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
        return lengthOfStorage;
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
