package myQueue;


import myLinkedList.MyLinkedList;

import java.util.Objects;

public class MyQueue<T> implements MyQueueList<T> {
    public static class Node<T> {
        T element;
        public MyQueue.Node<T> next;

        public Node(T element) {
            this.element = element;
        }
    }

    MyQueue.Node<T> first;
    MyQueue.Node<T> last;
    private int size;

    public static <T> MyQueueList<T> of(T... elements) {
        MyQueue<T> queue = new MyQueue<>();
        for (T e : elements) {
            queue.add(e);
        }
        return queue;
    }


    @Override
    public void add(T element) {
        MyQueue.Node<T> newNode = new MyQueue.Node<>(element);
        if (first == null) {
            first = last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        size++;
    }


    private MyQueue.Node<T> getNodeByIndex(int index) {
        MyQueue.Node<T> current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    @Override
    public void set(int index, T element) {
        Objects.checkIndex(index, size);
        MyQueue.Node<T> node = getNodeByIndex(index);
        node.element = element;
    }

    @Override
    public T peek() {
        return get(0);
    }

    @Override
    public T poll() {
        get(0);
        return remove(0);
                    }

    @Override
    public T get(int index) {
        Objects.checkIndex(index, size);
        return getNodeByIndex(index).element;


    }


    @Override
    public T remove(int index) {
        Objects.checkIndex(index, size);
        T removedElement;
        if (index == 0) {
            removedElement = first.element;
            first = first.next;
            if (first == null) {
                last = null;
            }
        } else {
            MyQueue.Node<T> prev = getNodeByIndex(index - 1);
            removedElement = prev.next.element;
            prev.next = prev.next.next;
            if (index == size - 1) {
                last = prev;
            }
        }
        size--;
        return removedElement;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        size=0;

    }

}
