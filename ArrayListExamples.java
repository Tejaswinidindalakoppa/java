import java.util.ArrayList;

public class ArrayListExamples {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        // Print the ArrayList
        System.out.println("Fruits List: " + fruits);

        // Access an element
        System.out.println("First Fruit: " + fruits.get(0));

        // Remove an element
        fruits.remove("Banana");
        System.out.println("After Removing Banana: " + fruits);

        // Iterate through the ArrayList
        System.out.println("Iterating over the list:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
