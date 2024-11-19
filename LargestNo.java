class LargestNo {
    public static void main(String[] args) {
        int a = 25, b = 20, c = 30;
        int largest = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("Largest number is: " + largest);
    }
}
