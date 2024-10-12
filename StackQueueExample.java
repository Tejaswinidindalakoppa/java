import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueExample {
    public static void main(String[] args) {
        // Stack Example
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack: " + stack);
        System.out.println("Popped from Stack: " + stack.pop());

        // Queue Example using LinkedList
        Queue<String> queue = new LinkedList<>();
        queue.add("Alice");
        queue.add("Bob");
        queue.add("Charlie");
        System.out.println("Queue: " + queue);
        System.out.println("Removed from Queue: " + queue.poll());
    }
}
