import java.util.LinkedList;

public class LinkedListOperation {
    public static void main(String[] args) {
        // Creating a LinkedList of integers
        LinkedList<Integer> numbers = new LinkedList<>();

        // Adding elements to the LinkedList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println("Initial LinkedList: " + numbers);

        // Adding elements at the beginning and end
        numbers.addFirst(5); // Add at the beginning
        numbers.addLast(40); // Add at the end
        System.out.println("After adding at beginning and end: " + numbers);

        // Checking the size of the LinkedList
        System.out.println("Size of the LinkedList: " + numbers.size());

        // Checking if a specific element exists
        System.out.println("Does the list contain 20? " + numbers.contains(20));
        System.out.println("Does the list contain 50? " + numbers.contains(50));

        // Removing the first and last elements
        numbers.removeFirst();
        numbers.removeLast();
        System.out.println("After removing first and last elements: " + numbers);

        // Clearing the LinkedList
        numbers.clear();
        System.out.println("LinkedList after clearing: " + numbers);
    }
}
