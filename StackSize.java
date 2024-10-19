import java.util.Stack;

public class StackSize {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        stack.push('A');
        stack.push('B');
        stack.push('C');

        System.out.println("Stack size: " + stack.size());
    }
}
