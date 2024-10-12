import java.util.ArrayList;

public class ArrayListExample1 {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Accessing elements using index
        System.out.println("First fruit: " + fruits.get(0));

        // Removing an element
        fruits.remove("Banana");

        // Displaying the updated ArrayList
        System.out.println("Updated Fruits List: " + fruits);

        // Looping through the ArrayList
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
