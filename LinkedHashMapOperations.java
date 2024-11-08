import java.util.LinkedHashMap;

public class LinkedHashMapOperations {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 30);
        
        System.out.println("LinkedHashMap: " + map);
        map.remove("B");
        System.out.println("LinkedHashMap after removal: " + map);
    }
}
