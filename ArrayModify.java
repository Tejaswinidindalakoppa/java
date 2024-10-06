public class ArrayModify {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        arr[2] = 100;  // Modify element at index 2
        for (int num : arr) {
            System.out.println(num);
        }
    }
}

