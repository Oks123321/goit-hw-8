package myStack;

import myQueue.MyQueue;
import myQueue.MyQueueList;

import java.util.ArrayList;
import java.util.Objects;

public class MyStack<T> implements Stack<T> {

    private int mSize;
    private int[] stackArray;
    private int last;

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
    public int remove() {
        return stackArray[last--];
    }

    /*@Override
    public int peek() {
        return stackArray[last];
    }*/

@Override
    public boolean isEmpty() {
        return (last == -1);
    }
@Override
    public boolean isFull() {
        return (last == mSize - 1);
    }
}




