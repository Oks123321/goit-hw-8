package myLinkedList;

public class MyLinkedListTests {
    public static void main(String[] args) {
        MyLinkedList<String> linkedList = new MyLinkedList<>();
        linkedList.add("abc");
        linkedList.add("aa");
        linkedList.add("231");

        System.out.println(linkedList.size());
        System.out.println(linkedList.get(0));
        System.out.println(linkedList.get(1));
        System.out.println(linkedList.get(2));
        System.out.println("linkedList.remove(1) = " + linkedList.remove(1));
        System.out.println("linkedList.size() = " + linkedList.size());

        System.out.println(linkedList.get(0));
        System.out.println(linkedList.get(1));

        linkedList.clear();
        System.out.println("stringList.size() = " + linkedList.size());
        System.out.println("linkedList.toString() = " + linkedList.toString());

    }
}
