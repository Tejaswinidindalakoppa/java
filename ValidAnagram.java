import java.util.Arrays;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        return Arrays.equals(sArr, tArr);
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println("Is anagram: " + isAnagram(s, t));
    }
}
