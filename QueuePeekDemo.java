import java.util.LinkedList;
import java.util.Queue;

public class QueuePeekDemo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("Apple");
        queue.add("Banana");
        queue.add("Cherry");

        // Peek the front element
        String frontElement = queue.peek();
        System.out.println("Front element: " + frontElement);
    }
}
