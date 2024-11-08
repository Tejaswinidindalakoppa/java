import java.util.ArrayList;

public class ArrayListOperations {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(10);
        list.add(20);
        list.add(30);
        
        System.out.println("ArrayList: " + list);
        System.out.println("Get element at index 1: " + list.get(1));
        list.remove(1);
        System.out.println("ArrayList after removal: " + list);
    }
}
