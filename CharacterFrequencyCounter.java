import java.util.HashMap;

public class CharacterFrequencyCounter {
    public static void main(String[] args) {
        String str = "interview";
        HashMap<Character, Integer> freqMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
        System.out.println("Character frequencies: " + freqMap);
    }
}
