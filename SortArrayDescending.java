import java.util.Arrays;
public class SortArrayDescending {
    public static void main(String[] args) {
        Integer[] arr = {5, 1, 4, 2, 3};
        Arrays.sort(arr, (a, b) -> b - a);
        System.out.println("Sorted Array (Descending): " + Arrays.toString(arr));
    }
}
