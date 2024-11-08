import java.util.LinkedList;

public class LinkedListOperations {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        
        list.add(10);
        list.add(20);
        list.addFirst(5);
        
        System.out.println("Linked List: " + list);
        System.out.println("First Element: " + list.getFirst());
        System.out.println("Last Element: " + list.getLast());
    }
}
