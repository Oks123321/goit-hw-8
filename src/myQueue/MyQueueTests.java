package myQueue;

public class MyQueueTests {
    public static void main(String[] args) {
        MyQueue<String> stringMyQueue = new MyQueue<>();
        stringMyQueue.add("One");
        stringMyQueue.add("Two");
        stringMyQueue.add("Three");
        stringMyQueue.add("Four");

        System.out.println(stringMyQueue.get(0));
        System.out.println(stringMyQueue.get(1));
        System.out.println(stringMyQueue.get(2));
        System.out.println(stringMyQueue.get(3));

//        System.out.println("stringMyQueue.peek() = " + stringMyQueue.peek());
//
//        System.out.println("stringMyQueue.size() = " + stringMyQueue.size());
//        System.out.println("stringMyQueue.poll() = " + stringMyQueue.poll());
//        System.out.println("stringMyQueue.size() = " + stringMyQueue.size());
//        System.out.println(stringMyQueue.get(0));
//        System.out.println(stringMyQueue.get(1));
//        System.out.println(stringMyQueue.get(2));
//
//        System.out.println("stringMyQueue.remove(0) = " + stringMyQueue.remove(0));
//        System.out.println("stringMyQueue.size() = " + stringMyQueue.size());
//        stringMyQueue.clear();
        System.out.println("stringMyQueue.size() = " + stringMyQueue.size());
        System.out.println("stringMyQueue.remove(5) = " + stringMyQueue.remove(5));
        System.out.println("stringMyQueue.size() = " + stringMyQueue.size());
        System.out.println("stringMyQueue.remove(0) = " + stringMyQueue.remove(0));
        System.out.println("stringMyQueue.size() = " + stringMyQueue.size());
        System.out.println("stringMyQueue.get(5) = " + stringMyQueue.get(5));
        System.out.println("stringMyQueue.size() = " + stringMyQueue.size());


    }


}
