public class ArrayParameterExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40};
        printArray(numbers);
    }
    
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.println(num);
        }
    }
}
