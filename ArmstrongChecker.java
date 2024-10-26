public class ArmstrongChecker {
    public static void main(String[] args) {
        int num = 153, temp = num, sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, 3);
            temp /= 10;
        }
        System.out.println(num + " is " + (num == sum ? "" : "not ") + "an Armstrong number");
    }
}
