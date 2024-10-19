import java.util.Stack;

public class SearchStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Red");
        stack.push("Blue");
        stack.push("Green");

        // Search for an element
        int position = stack.search("Blue");
        System.out.println("Position of Blue: " + position);
    }
}
