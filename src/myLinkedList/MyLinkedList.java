package myLinkedList;

import java.util.NoSuchElementException;
import java.util.Objects;

public class MyLinkedList<T> implements MyList<T> {
    static class Node<T> {
        T element;
        Node<T> next;

        public Node(T element) {
            this.element = element;
        }
    }

    Node<T> first;
    Node<T> last;
    private int size;

    public static <T> MyList<T> of(T... elements) {
        MyLinkedList<T> linkedList = new MyLinkedList<>();
        for (T e : elements) {
            linkedList.add(e);
        }
        return linkedList;
    }


    @Override
    public void add(T element) {
        Node<T> newNode = new Node<>(element);
        if (first == null) {
            first = last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        size++;
    }


    @Override
    public void add(int index, T element) {
        Objects.checkIndex(index, size + 1);
        Node<T> newNode = new Node<T>(element);
        if (first == null) {
            first = last = newNode;
        } else if (index == 0) {
            newNode.next = first;
            first = newNode;
        } else if (index == size) {
            last.next = newNode;
            last = newNode;
        } else {
            Node<T> prev = getNodeByIndex(index - 1);
            for (int i = 0; i < index; i++) {
                prev = prev.next;
            }
            newNode.next = prev.next;
            prev.next = newNode;
        }
        size++;

    }

    private Node<T> getNodeByIndex(int index) {
        Node<T> current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    @Override
    public void set(int index, T element) {
        Objects.checkIndex(index, size);
        Node<T> node = getNodeByIndex(index);
        node.element = element;
    }


    @Override
    public T get(int index) {
        Objects.checkIndex(index, size);
        return getNodeByIndex(index).element;
    }


    @Override
    public T getFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return get(0);
    }

    @Override
    public T getLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return get(size - 1);
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
            Node<T> prev = getNodeByIndex(index - 1);
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
    public boolean contains(T element) {
        Node<T> current = first;
        for (int i = 0; i < size; i++) {
            if (current.element.equals(element)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        if (first == null) {
            return true;
        } else {
            return false;
        }
    }


    @Override
    public int size() {
        return size;
    }


    @Override
    public void clear() {
        first = last = null;
        size = 0;
    }

}



