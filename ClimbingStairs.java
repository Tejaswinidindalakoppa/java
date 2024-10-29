public class ClimbingStairs {
    public static int climbStairs(int n) {
        if (n <= 1) return 1;
        int a = 1, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Ways to climb stairs: " + climbStairs(n));
    }
}
