import java.util.Stack;

public class PeekElement {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Apple");
        stack.push("Banana");

        // Peek at the top element
        System.out.println("Top element: " + stack.peek());
    }
}
