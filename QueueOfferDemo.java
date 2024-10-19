import java.util.LinkedList;
import java.util.Queue;

public class QueueOfferDemo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        
        // Offer elements to the queue
        queue.offer("Red");
        queue.offer("Green");
        queue.offer("Blue");

        System.out.println("Queue: " + queue);
    }
}
