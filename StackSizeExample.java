import java.util.Stack;

public class StackSizeExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Hello");
        stack.push("World");
        
        System.out.println("Stack size: " + stack.size());
    }
}
