package myLinkedList;

public class MyLinkedListTests {
    public static void main(String[] args) {
        MyLinkedList<String> stringList = new MyLinkedList();
        stringList.add("abc");
        stringList.add("aa");
        stringList.add("231");

        System.out.println(stringList.size());
        System.out.println(stringList.get(1));
        System.out.println(stringList.contains("aa"));
        // stringList.clear();
        //System.out.println(stringList.size());//

        System.out.println(stringList.getFirst());
        System.out.println(stringList.getLast());
        System.out.println(stringList.isEmpty());
        System.out.println(stringList.remove(1));
        stringList.clear();
        System.out.println("stringList.size() = " + stringList.size());

    }
}
