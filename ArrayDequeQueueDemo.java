import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDequeQueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();

        queue.add("First");
        queue.add("Second");
        queue.add("Third");

        System.out.println("Queue: " + queue);
    }
}
