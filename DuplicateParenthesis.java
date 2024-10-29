import java.util.Stack;

public class DuplicateParenthesis {
    public static boolean hasDuplicateParenthesis(String expression) {
        Stack<Character> stack = new Stack<>();
        for (char ch : expression.toCharArray()) {
            if (ch == ')') {
                int count = 0;
                while (stack.pop() != '(') count++;
                if (count < 1) return true;
            } else {
                stack.push(ch);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasDuplicateParenthesis("(a+(b))"));    // true
        System.out.println(hasDuplicateParenthesis("(a+b)"));      // false
    }
}
