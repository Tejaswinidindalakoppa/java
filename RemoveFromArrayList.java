import java.util.ArrayList;

public class RemoveFromArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.remove("Banana");
        System.out.println(list);
    }
}
