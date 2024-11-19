class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3, 8, 4, 9, 5};
        int key = 4;
        boolean found = false;
        for (int num : arr) {
            if (num == key) {
                found = true;
                break;
            }
        }
        System.out.println(key + " is " + (found ? "found in the array." : "not found in the array."));
    }
}
