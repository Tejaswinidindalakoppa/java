public class MaxElement {
    public static void main(String[] args) {
        int[] arr = {12, 34, 54, 2, 93};
        int max = arr[0];
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println("Maximum Element: " + max);
    }
}

