package myHashMap;


class HashMapTest {

    public static void main(String[] args) {
       MyHashMap strings = new MyHashMap();
        strings.put("Ann","1");
        strings.put("Bill", "2");
        strings.put("Elvira","3");
        strings.put("Roman", "4");

        System.out.println("strings.get(\"Ann\") = " + strings.get("Ann"));
        System.out.println("strings.get(\"Bill\") = " + strings.get("Bill"));
        System.out.println("strings.get(\"Elvira\") = " + strings.get("Elvira"));
       System.out.println("strings.get(\"Roman\") = " + strings.get("Roman"));
        System.out.println("strings.get(\"Shark\") = " + strings.get("Shark"));

        System.out.println("strings.remove(\"Roman\") = " + strings.remove("Roman"));
        System.out.println("strings.get(\"Roman\") = " + strings.get("Roman"));
        System.out.println("strings.size() = " + strings.size());

        strings.clear();
        System.out.println("strings.get(\"Ann\") = " + strings.get("Ann"));
        System.out.println("strings.get(\"Bill\") = " + strings.get("Bill"));
        System.out.println("strings.get(\"Elvira\") = " + strings.get("Elvira"));
        System.out.println("strings.get(\"Roman\") = " + strings.get("Roman"));
        System.out.println("strings.size() = " + strings.size());


    }
}