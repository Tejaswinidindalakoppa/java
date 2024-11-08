import java.util.PriorityQueue;

public class PriorityQueueOperations {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        pq.add(30);
        pq.add(10);
        pq.add(20);
        
        System.out.println("PriorityQueue: " + pq);
        System.out.println("Peek: " + pq.peek());
        System.out.println("Poll: " + pq.poll());
        System.out.println("PriorityQueue after poll: " + pq);
    }
}
