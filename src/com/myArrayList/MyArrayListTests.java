package com.myArrayList;

public class MyArrayListTests {
    public static void main(String[] args) {
        MyArrayList<String> strings = new MyArrayList<>();
        strings.add("first");
        strings.add("second");
        strings.add("third");
        System.out.println("strings = " + strings);
        strings.remove(0);
        System.out.println("strings = " + strings);
        strings.remove(3);
        System.out.println("strings.get(3) = " + strings.get(3));
        System.out.println("strings.size() = " + strings.size());


    }
}

