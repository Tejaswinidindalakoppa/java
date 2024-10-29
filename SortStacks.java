import java.util.Collections;
import java.util.Stack;

public class SortStacks {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(2);

        Collections.sort(stack);
        System.out.println("Sorted stack: " + stack);
    }
}
