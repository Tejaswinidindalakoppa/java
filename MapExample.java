import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {
    public static void main(String[] args) {
        // HashMap Example
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Apple");
        hashMap.put(2, "Banana");
        hashMap.put(3, "Cherry");
        System.out.println("HashMap: " + hashMap);

        // TreeMap Example
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(2, "Car");
        treeMap.put(1, "Bike");
        treeMap.put(3, "Truck");
        System.out.println("TreeMap: " + treeMap);
    }
}

