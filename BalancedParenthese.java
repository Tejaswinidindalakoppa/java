import java.util.Stack;
import java.util.Scanner;

public class BalancedParenthese {
    // Method to check if parentheses are balanced
    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char ch : expression.toCharArray()) {
            // Push opening brackets onto the stack
            if (ch == '{' || ch == '(' || ch == '[') {
                stack.push(ch);
            }
            // For closing brackets, check if they match the top of the stack
            else if (ch == '}' || ch == ')' || ch == ']') {
                // If stack is empty or top doesn't match, return false
                if (stack.isEmpty() || !isMatchingPair(stack.pop(), ch)) {
                    return false;
                }
            }
        }
        // If stack is empty at the end, all brackets were balanced
        return stack.isEmpty();
    }

    // Helper method to check if the characters are a matching pair
    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }

    // Main method to test the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an expression with parentheses: ");
        String expression = scanner.nextLine();

        if (isBalanced(expression)) {
            System.out.println("The parentheses are balanced.");
        } else {
            System.out.println("The parentheses are not balanced.");
        }

        scanner.close();
    }
}
