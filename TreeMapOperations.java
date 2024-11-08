import java.util.TreeMap;

public class TreeMapOperations {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        
        map.put("C", 30);
        map.put("A", 10);
        map.put("B", 20);
        
        System.out.println("TreeMap: " + map);
        System.out.println("First Key: " + map.firstKey());
        System.out.println("Last Key: " + map.lastKey());
    }
}
