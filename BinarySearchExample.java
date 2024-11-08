import java.util.Arrays;

public class BinarySearchExample {
    public static int binarySearch(int[] arr, int key) {
        Arrays.sort(arr);
        int index = Arrays.binarySearch(arr, key);
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int key = 30;
        System.out.println("Element found at index: " + binarySearch(arr, key));
    }
}
