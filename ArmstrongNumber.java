class ArmstrongNumber {
    public static void main(String[] args) {
        int number = 153, original = number, sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum += digit * digit * digit;
            number /= 10;
        }
        System.out.println(original + " is " + (sum == original ? "an Armstrong number." : "not an Armstrong number."));
    }
}
