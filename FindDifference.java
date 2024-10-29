public class FindDifference {
    public static char findTheDifference(String s, String t) {
        char result = 0;
        for (char c : s.toCharArray()) result ^= c;
        for (char c : t.toCharArray()) result ^= c;
        return result;
    }

    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
        System.out.println("Difference: " + findTheDifference(s, t));
    }
}
