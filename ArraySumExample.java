public class ArraySumExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};  // Array declaration

        int sum = 0;
        for (int number : numbers) {
            sum += number;  // Adding each element to sum
        }

        System.out.println("Sum of array elements: " + sum);
    }
}
