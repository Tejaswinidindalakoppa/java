public class LargestElement {
    public static int findLargest(int[] arr) {
        int max = arr[0];
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 30};
        System.out.println(findLargest(arr)); // Output: 30
    }
}
