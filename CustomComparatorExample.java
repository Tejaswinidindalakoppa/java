import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class CustomComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer a, Integer b) {
        return b - a;
    }
}

public class CustomComparatorExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(10);
        list.add(20);
        list.add(30);
        
        Collections.sort(list, new CustomComparator());
        System.out.println("Sorted in descending order: " + list);
    }
}
