package myStack;

import myQueue.MyQueue;
import myQueue.MyQueueList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class MyStack<T> implements Stack<T> {

    private int mSize;
    private int[] stackArray;
    private int last;
    private int size;

    public MyStack(int m) {
        this.mSize = m;
        stackArray = new int[mSize];
        last = -1;
    }


    @Override
    public void push(int element) {
        stackArray[++last] = element;
    }

    @Override
    public int peek() {
        return stackArray[last];
    }
    @Override
    public int pop() {
        return stackArray[0];
    }

   /* @Override
    public void remove(int index) {
        try {
            T[] temp = stackArray;
            stackArray = (T[]) new Object[temp.length - 1];
            System.arraycopy(temp, 0, stackArray, 0, index);
            int amountElemAfterIndex = temp.length - index - 1;
            System.arraycopy(temp, index + 1, stackArray, index, amountElemAfterIndex);
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }
           }*/

    @Override
    public boolean isEmpty() {
        return (last == -1);
    }
@Override
    public boolean isFull() {
        return (last == mSize - 1);
    }

    @Override
    public int size() {
        return stackArray.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(stackArray);
    }


}




