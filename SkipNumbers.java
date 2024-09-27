class SkipNumbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 3 || i == 7) {
                continue; // skip 3 and 7
            }
            System.out.println(i);
        }
    }
}
