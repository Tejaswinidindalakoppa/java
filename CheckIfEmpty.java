import java.util.Stack;

public class CheckIfEmpty {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        System.out.println("Is stack empty? " + stack.isEmpty());
        
        stack.push(10);
        System.out.println("Is stack empty after push? " + stack.isEmpty());
    }
}
