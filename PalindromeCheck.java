import java.util.Stack;

public class PalindromeCheck {
    public static boolean isPalindrome(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            stack.push(ch);
        }

        for (char ch : str.toCharArray()) {
            if (ch != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String input = "madam";
        System.out.println("Is palindrome: " + isPalindrome(input));
    }
}
``
