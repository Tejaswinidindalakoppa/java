public class Fibonacci {
    public static int fibonacciRec(int n) {
        if (n <= 1) return n;
        return fibonacciRec(n - 1) + fibonacciRec(n - 2);
    }

    public static void fibonacciIter(int n) {
        int a = 0, b = 1, c;
        System.out.print(a + " " + b);
        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        fibonacciIter(5);
        System.out.println("\n" + fibonacciRec(5)); // Output: 5
    }
}
