import java.util.Scanner;

public class UserInputArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];  // Array of size 5

        // Getting input from user
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter a number: ");
            numbers[i] = scanner.nextInt();
        }

        // Display the array elements
        System.out.println("You entered:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
