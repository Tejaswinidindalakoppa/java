import java.util.TreeSet;

public class TreeSetOperations {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        
        set.add(30);
        set.add(10);
        set.add(20);
        
        System.out.println("TreeSet: " + set);
        System.out.println("First Element: " + set.first());
        System.out.println("Last Element: " + set.last());
    }
}
