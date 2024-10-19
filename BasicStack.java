import java.util.Stack;

public class BasicStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Pop elements
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());
    }
}
