import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> list = new LinkedList<>();

        // Add elements to the LinkedList
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");

        // Display the LinkedList
        System.out.println("LinkedList: " + list);

        // Add an element at the first position
        list.addFirst("Avocado");
        System.out.println("After addFirst: " + list);

        // Add an element at the last position
        list.addLast("Elderberry");
        System.out.println("After addLast: " + list);

        // Remove the first element
        list.removeFirst();
        System.out.println("After removeFirst: " + list);

        // Remove the last element
        list.removeLast();
        System.out.println("After removeLast: " + list);

        // Get an element at a specific index
        String fruit = list.get(2); // Index starts at 0
        System.out.println("Element at index 2: " + fruit);

        // Check if the LinkedList contains a specific element
        boolean containsCherry = list.contains("Cherry");
        System.out.println("Contains Cherry? " + containsCherry);

        // Size of the LinkedList
        System.out.println("Size of LinkedList: " + list.size());

        // Clear the LinkedList
        list.clear();
        System.out.println("After clear: " + list);
    }
}
