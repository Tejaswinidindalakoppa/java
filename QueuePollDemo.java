import java.util.LinkedList;
import java.util.Queue;

public class QueuePollDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Element removed by poll(): " + queue.poll());
        System.out.println("Queue after poll(): " + queue);
    }
}
