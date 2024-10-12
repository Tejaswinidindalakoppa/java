import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Emma");
        names.add("Lucy");

        // Creating an Iterator
        Iterator<String> iterator = names.iterator();

        // Using Iterator to traverse through ArrayList
        System.out.println("Names using Iterator:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

