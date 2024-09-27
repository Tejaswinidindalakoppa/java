class FactorialExample {
    public static void main(String[] args) {
        int number = 5;
        int factorial = 1;
        int i = 1;

        while (i <= number) {
            factorial *= i;
            i++;
        }

        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}
