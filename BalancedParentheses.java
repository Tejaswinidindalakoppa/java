import java.util.Stack;

public class BalancedParentheses {
    public static boolean isBalanced(String expr) {
        Stack<Character> stack = new Stack<>();

        for (char ch : expr.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String expression = "((()))";
        System.out.println("Is balanced: " + isBalanced(expression));
    }
}
