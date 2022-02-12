package myStack;

import com.myArrayList.ArrayIterator;
import myQueue.MyQueue;
import myQueue.MyQueueList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

public class MyStack<E> implements Stack<E> {

    private E[] values;
    E first;
    E last;


    public MyStack() {
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
        if (values == null) {
            return null;
        } else return values[index];
    }

    @Override
    public int size() {
        if (values == null) {
            return 0;
        } else
            return values.length;
    }

    @Override
    public void clear() {
        values = null;
    }

    @Override
    public E peek() {
        first = values[0];
        return first;
    }

    @Override
    public E pop() {
        first = values[values.length - 1];
        E[] temp = Arrays.copyOf(values,values.length-1);

        values = temp;
        return first;
    }


    @Override
    public String toString() {
        return Arrays.toString(values);
    }
}




