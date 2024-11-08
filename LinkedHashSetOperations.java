import java.util.LinkedHashSet;

public class LinkedHashSetOperations {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        
        set.add(10);
        set.add(20);
        set.add(30);
        
        System.out.println("LinkedHashSet: " + set);
        set.remove(20);
        System.out.println("LinkedHashSet after removal: " + set);
    }
}
