package com.myArrayList;

import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList<E> implements MyList<E> {


    private E[] values;

    public MyArrayList() {
        values = (E[]) new Object[0];
    }

    @Override
    public void add(E e) {

           E[] temp = values;
            values = (E[]) new Object[temp.length + 1];
            System.arraycopy(temp, 0, values, 0, temp.length);
            values[values.length - 1] = e;

    }

    @Override
    public void remove(int index) {
            E[] temp = values;
            values = (E[]) new Object[temp.length - 1];
            System.arraycopy(temp, 0, values, 0, index);
            int amountElemAfterIndex = temp.length - index - 1;
            System.arraycopy(temp, index + 1, values, index, amountElemAfterIndex);
            }

    @Override
    public E get(int index) {
        if (values==null){
            return null;
        }
      else return values[index];
    }

    @Override
    public int size() {
        if (values==null){
            return 0;
        }
        else
        return values.length;
    }

    @Override
    public void update(int index, E e) {
        values[index] = e;
    }

    @Override
    public void clear() {
        values = null;
    }

    @Override
    public Iterator<E> iterator() {
        return new ArrayIterator<>(values);
    }

    @Override
    public String toString() {
        return Arrays.toString(values);
    }
}
