import java.util.Stack;

public class StackSearch {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        
        System.out.println("Position of B: " + stack.search("B"));
        System.out.println("Position of D (not in stack): " + stack.search("D"));
    }
}
