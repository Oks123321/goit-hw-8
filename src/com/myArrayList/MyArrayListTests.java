package com.myArrayList;

public class MyArrayListTests {
    public static void main(String[] args) {
        MyList<String> strings = new MyArrayList<>();
        strings.add("first");
        strings.add("second");
        strings.add("third");
        //strings.update(1, "update");
        //strings.remove(1);
        System.out.println("strings.get(1) = " + strings.get(0));
        System.out.println("strings.size() = " + strings.size());
        System.out.println(strings.clear());

    }
}

