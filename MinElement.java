public class MinElement {
    public static void main(String[] args) {
        int[] arr = {12, 34, 54, 2, 93};
        int min = arr[0];
        for (int i : arr) {
            if (i < min) {
                min = i;
            }
        }
        System.out.println("Minimum Element: " + min);
    }
}
