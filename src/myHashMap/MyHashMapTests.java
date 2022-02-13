package myHashMap;

public class MyHashMapTests {
    public static void main(String[] args) {
        MyHashMap<String, String> strings = new MyHashMap<>();
        strings.put("Bill", "f");
        strings.put("Alice", "b");
        strings.put("Barbara", "d");
        strings.put("Andrew", "e");
        strings.put("Jhon", "a");


        System.out.println("strings.get(\"Jhony\") = " + strings.get("Jhony"));
        System.out.println("strings.get(\"Leo\") = " + strings.get("Leo"));
        System.out.println("strings.get(\"Alice\") = " + strings.get("Alice"));
        System.out.println("strings.get(\"Andrew\") = " + strings.get("Andrew"));
        System.out.println("strings.get(\"Bill\") = " + strings.get("Bill"));
        System.out.println("strings.get(\"Jhon\") = " + strings.get("Jhon"));

        System.out.println("strings.size() = " + strings.size());
        System.out.println("strings.remove(\"Jhon\") = " + strings.remove("Jhon"));
        System.out.println("strings.size() = " + strings.size());
        System.out.println("strings.remove(\"Leo\") = " + strings.remove("Leo"));
        System.out.println("strings.size() = " + strings.size());


    }
}
