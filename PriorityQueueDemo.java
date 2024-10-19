import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        Queue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(30);
        priorityQueue.add(20);
        priorityQueue.add(10);

        System.out.println("PriorityQueue: " + priorityQueue);
    }
}
