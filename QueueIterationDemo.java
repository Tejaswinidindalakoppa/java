import java.util.LinkedList;
import java.util.Queue;

public class QueueIterationDemo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("John");
        queue.add("Doe");
        queue.add("Jane");

        for (String name : queue) {
            System.out.println(name);
        }
    }
}
