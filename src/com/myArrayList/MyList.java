package com.myArrayList;

public interface MyList<E> extends Iterable<E> {
    void add(E e);

    void remove(int index);

    E get(int index);

    int size();

    void update(int index, E e);

    void clear();
}