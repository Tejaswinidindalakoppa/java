public class ArraySum1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("Sum: " + sum);
    }
}

