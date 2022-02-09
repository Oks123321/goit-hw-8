package myQueue;

public interface MyQueueList<T> {
    void add(T element);//+
    T get(int index);//+
    T remove(int index);//+
    int size();//+
    void clear();
    void set(int index, T element);
    T peek();
    T poll();
}
