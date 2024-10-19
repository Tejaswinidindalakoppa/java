import java.util.LinkedList;
import java.util.Queue;

public class QueueContainsDemo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Monday");
        queue.add("Tuesday");
        queue.add("Wednesday");

        if (queue.contains("Tuesday")) {
            System.out.println("Tuesday is in the queue");
        } else {
            System.out.println("Tuesday is not in the queue");
        }
    }
}

