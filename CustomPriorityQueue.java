import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class CustomPriorityQueue {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(100);
        pq.add(50);
        pq.add(150);

        System.out.println("PriorityQueue (reverse order): " + pq);
    }
}

