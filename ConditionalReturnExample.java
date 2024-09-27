class ConditionalReturnExample {
    public static void main(String[] args) {
        printMessage(5);
        printMessage(-1);
    }

    static void printMessage(int num) {
        if (num < 0) {
            return; // exit the method if the number is negative
        }
        System.out.println("The number is: " + num);
    }
}
