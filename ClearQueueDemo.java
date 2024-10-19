import java.util.LinkedList;
import java.util.Queue;

public class ClearQueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(100);
        queue.add(200);
        queue.add(300);

        System.out.println("Queue before clearing: " + queue);
        queue.clear();
        System.out.println("Queue after clearing: " + queue);
    }
}
