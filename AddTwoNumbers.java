import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        // Ask the user for two numbers
        try ( // Create a Scanner object for input
                Scanner scanner = new Scanner(System.in)) {
            // Ask the user for two numbers
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();
            // Calculate the sum
            int sum = num1 + num2;
            // Print the result
            System.out.println("The sum is: " + sum);
            // Close the scanner
        }
    }
}
