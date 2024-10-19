import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Add elements to the queue
        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Queue: " + queue);

        // Remove an element from the queue
        int removedElement = queue.remove();
        System.out.println("Removed element: " + removedElement);
        System.out.println("Queue after removal: " + queue);
    }
}

