import java.util.LinkedList;
import java.util.Queue;

public class GenericQueueDemo {
    public static void main(String[] args) {
        Queue<String> stringQueue = new LinkedList<>();
        Queue<Integer> integerQueue = new LinkedList<>();

        stringQueue.add("Hello");
        integerQueue.add(123);

        System.out.println("String Queue: " + stringQueue);
        System.out.println("Integer Queue: " + integerQueue);
    }
}
