import java.util.Arrays;

class BinarySearches {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        int key = 5;
        int index = Arrays.binarySearch(arr, key);
        System.out.println("Key found at index: " + index);
    }
}
