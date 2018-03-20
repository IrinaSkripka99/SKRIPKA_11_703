package ru.itis.Sidikov.Map;

/**
 * 15.03.2018
 * HashMapImpl
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class HashMapImpl<K, V> implements Map<K, V> {

    private V map[];

    public HashMapImpl() {
        map = (V[])new Object[10];
    }

    @Override
    public void put(K key, V value) {
        int position = Math.abs(key.hashCode() % 10);
        map[position] = value;
    }

    @Override
    public V get(K key) {
        int position = Math.abs(key.hashCode() % 10);
        for (int i = 0; i <map.length ; i++) {

        }
        return null;
    }
}
