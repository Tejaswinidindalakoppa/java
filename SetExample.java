import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        // HashSet Example
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        System.out.println("HashSet: " + hashSet);

        // LinkedHashSet Example
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("One");
        linkedHashSet.add("Two");
        linkedHashSet.add("Three");
        System.out.println("LinkedHashSet: " + linkedHashSet);

        // TreeSet Example
        TreeSet<Double> treeSet = new TreeSet<>();
        treeSet.add(1.1);
        treeSet.add(2.2);
        treeSet.add(3.3);
        System.out.println("TreeSet: " + treeSet);
    }
}

