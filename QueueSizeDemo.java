import java.util.LinkedList;
import java.util.Queue;

public class QueueSizeDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(5);
        queue.add(10);
        queue.add(15);

        System.out.println("Size of the queue: " + queue.size());
    }
}
