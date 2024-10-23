public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        int n = 5;
        int totalSum = n * (n + 1) / 2;
        int arrSum = 0;
        for (int i : arr) {
            arrSum += i;
        }
        System.out.println("Missing Number: " + (totalSum - arrSum));
    }
}
