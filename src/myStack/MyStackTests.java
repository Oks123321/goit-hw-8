package myStack;

public class MyStackTests {

    public static void main(String[] args) {
        MyStack<String> stack = new MyStack<>();
        stack.add("Lime");
        stack.add("Banana");
        stack.add("Orange");
        System.out.println("stack = " + stack);
//        System.out.println("stack.remove(0) = " + stack.remove(0));
        System.out.println("stack.get(0) = " + stack.get(0));
        System.out.println("stack.get(1) = " + stack.get(1));
        System.out.println("stack.get(2) = " + stack.get(2));
//        stack.remove(2);
//        System.out.println("stack = " + stack);
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack = " + stack);

    }


}
