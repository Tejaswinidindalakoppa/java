public class MaxInArray {
    public static void main(String[] args) {
        int[] arr = {1, 5, 9, 3, 7};
        int max = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
        }
        System.out.println("Largest element: " + max);
    }
}
