import java.util.Stack;

public class StackRecursion {
    public static void reverse(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int temp = stack.pop();
            reverse(stack);
            insertAtBottom(stack, temp);
        }
    }

    private static void insertAtBottom(Stack<Integer> stack, int value) {
        if (stack.isEmpty()) {
            stack.push(value);
        } else {
            int temp = stack.pop();
            insertAtBottom(stack, value);
            stack.push(temp);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        reverse(stack);
        System.out.println("Reversed Stack: " + stack);
    }
}
