import java.util.Stack;

public class CheckEmptyStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        System.out.println("Is stack empty? " + stack.isEmpty());

        stack.push(100);
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
