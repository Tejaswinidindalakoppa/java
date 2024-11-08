import java.util.ArrayDeque;

public class ArrayDequeOperations {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        
        deque.addFirst(10);
        deque.addLast(20);
        deque.addLast(30);
        
        System.out.println("ArrayDeque: " + deque);
        System.out.println("Poll First: " + deque.pollFirst());
        System.out.println("ArrayDeque after poll: " + deque);
    }
}
