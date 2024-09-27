class WhileContinueExample {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            i++;
            if (i == 5) {
                continue; // skip the iteration when i is 5
            }
            System.out.println(i);
        }
    }
}

