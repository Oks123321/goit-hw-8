package myHashMap;

public class MyHashMapTests {
    public static void main(String[] args) {
        MyHashMap<String, String> strings = new MyHashMap<>();
        strings.put("Jhon", "a");
        strings.put("Alice", "b");
        //     strings.insert("Jhon", "c");
        System.out.println("strings.get(\"Jhon\") = " + strings.get("Jhon"));
        System.out.println("strings.get(\"Alice\") = " + strings.get("Alice"));
        strings.put("Barbara", "d");
        System.out.println("strings.get(\"Barbara\") = " + strings.get("Barbara"));
        strings.put("Barbara","e");
        System.out.println("strings.get(\"Barbara\") = " + strings.get("Barbara"));
        strings.remove("Barbara");
        System.out.println("strings.get(\"Barbara\") = " + strings.get("Barbara"));




    }
}
