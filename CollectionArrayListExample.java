import java.util.ArrayList;
import java.util.Collection;

public class CollectionArrayListExample {
    public static void main(String[] args) {
        // Creating a Collection using ArrayList
        Collection<String> animals = new ArrayList<>();

        // Adding elements
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Rabbit");

        // Displaying the collection
        System.out.println("Animals: " + animals);
    }
}
