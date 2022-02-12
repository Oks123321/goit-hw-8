package myHashMap;

public class MyHashMapTests {
    public static void main(String[] args) {
        MyHashMap<String, String> strings = new MyHashMap<>();
        strings.put("Jhon", "a");
        strings.put("Alice", "b");
        strings.put("Barbara", "d");
        strings.put("Andrew", "e");
        System.out.println("strings.get(\"Barbara\") = " + strings.get("Barbara"));
        strings.remove("Barbara");
        System.out.println("strings.get(\"Barbara\") = " + strings.get("Barbara"));
        System.out.println("strings.size() = " + strings.size());
        System.out.println("strings.get(\"Andrew\") = " + strings.get("Andrew"));
        System.out.println("strings = " + strings);
        strings.clear();
        System.out.println("strings.get(\"Alice\") = " + strings.get("Alice"));


    }
}
