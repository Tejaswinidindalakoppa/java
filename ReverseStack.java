import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        Stack<Integer> reversedStack = new Stack<>();
        while (!stack.isEmpty()) {
            reversedStack.push(stack.pop());
        }

        System.out.println("Reversed Stack: " + reversedStack);
    }
}

