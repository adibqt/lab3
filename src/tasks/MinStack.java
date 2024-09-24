package  tasks;
import java.util.Stack;

public class MinStack {
    private Stack<Integer> mainStack;
    private Stack<Integer> minStack;

    public MinStack() {
        mainStack = new Stack<>();
        minStack = new Stack<>();
    }


    public void push(int x) {
        mainStack.push(x);


        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }


    public void pop() {
        if (!mainStack.isEmpty()) {
            int poppedValue = mainStack.pop();


            if (poppedValue == minStack.peek()) {
                minStack.pop();
            }
        }
    }


    public int min() {
        return minStack.peek();
    }


    public static void main(String[] args) {
        MinStack stack = new MinStack();


        stack.push(3);
        stack.push(2);
        stack.push(5);
        stack.push(1);
        System.out.println("Minimum value: " + stack.min());


        stack.pop();
        System.out.println("Minimum value: " + stack.min());


        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println("Minimum value: " + stack.min());
    }
}
