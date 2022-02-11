package myStack;

public class MyStackTests {

    public static void main(String[] args) {
        MyStack <Integer> mStack = new MyStack<>(10);

        mStack.push(79);
        mStack.push(59);
        mStack.push(35);
        mStack.push(24);
        mStack.push(15);

       /* mStack.remove();

        System.out.print("Стек: ");
        while (!mStack.isEmpty()) {
            int value = mStack.remove();
            System.out.print(value);
            System.out.print(" ");
        }
        System.out.println("");*/
        //System.out.println("mStack.peek() = " + mStack.peek());
       // System.out.println("mStack.size() = " + mStack.size());
        System.out.println("mStack = " + mStack);
        System.out.println("mStack.size() = " + mStack.size());
        System.out.println("mStack.peek() = " + mStack.peek());


    }
}
