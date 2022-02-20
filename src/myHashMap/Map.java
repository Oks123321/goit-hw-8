package myHashMap;

public interface Map <K, V>{
    int size();

    V get (K key);

    V put(K k, V v);

    V remove(Object k);
}
