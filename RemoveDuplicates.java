import java.util.Arrays;
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        int[] result = Arrays.stream(arr).distinct().toArray();
        System.out.println("Array without duplicates: " + Arrays.toString(result));
    }
}
