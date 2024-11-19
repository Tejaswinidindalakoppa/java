class PrimeChecks {
    public static void main(String[] args) {
        int n = 13;
        boolean isPrime = true;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(n + " is " + (isPrime ? "a prime number." : "not a prime number."));
    }
}
