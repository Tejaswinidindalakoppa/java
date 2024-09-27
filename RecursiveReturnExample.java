class RecursiveReturnExample {
    public static void main(String[] args) {
        printNumbers(5);
    }

    static void printNumbers(int n) {
        if (n <= 0) {
            return; // exit the method when n is 0 or negative
        }
        System.out.println(n);
        printNumbers(n - 1); // recursive call
    }
}
