import java.util.Stack;

public class ReverseStringing {
    public static void main(String[] args) {
        String input = "Hello";
        Stack<Character> stack = new Stack<>();
        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }
        
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        
        System.out.println("Reversed string: " + reversed);
    }
}
