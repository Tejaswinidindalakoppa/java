public class SearchArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int search = 3;
        boolean found = false;
        for (int i : arr) {
            if (i == search) {
                found = true;
                break;
            }
        }
        System.out.println("Element found: " + found);
    }
}
