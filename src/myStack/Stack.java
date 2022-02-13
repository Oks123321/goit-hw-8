package myStack;

public interface Stack<E> {


    void add(E e);

    void remove(int index);

    E get(int index);

    int size();

    void clear();

    E peek(); //LIFO

    E pop(); //LIFO and remove
}


