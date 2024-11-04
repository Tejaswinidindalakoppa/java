import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Create a Queue
        Queue<Integer> queue = new LinkedList<>();

        // Add elements to the queue
        queue.add(10);
        queue.add(20);
        queue.add(30);

        // Display the queue
        System.out.println("Queue: " + queue);

        // Remove an element from the front of the queue
        int removedElement = queue.poll();
        System.out.println("Removed Element: " + removedElement);

        // Display the queue after removal
        System.out.println("Queue after removal: " + queue);

        // Peek the front element without removing it
        int frontElement = queue.peek();
        System.out.println("Front Element: " + frontElement);
    }
}
