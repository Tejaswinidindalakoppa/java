import java.util.HashMap;

public class HashMapOperations {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 30);
        
        System.out.println("HashMap: " + map);
        System.out.println("Value for key B: " + map.get("B"));
        map.remove("B");
        System.out.println("HashMap after removal: " + map);
    }
}
