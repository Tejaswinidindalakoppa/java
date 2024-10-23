public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > max) {
                secondMax = max;
                max = i;
            } else if (i > secondMax && i != max) {
                secondMax = i;
            }
        }
        System.out.println("Second Largest: " + secondMax);
    }
}
