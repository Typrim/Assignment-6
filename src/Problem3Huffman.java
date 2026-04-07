import java.util.HashMap;
import java.util.Map;

public class Problem3Huffman {
    public Map<Character, Integer> frequencyCount(String text) {
        Map<Character, Integer> frequencies = new HashMap<>();
        for (char character : text.toCharArray()) {
            if (frequencies.containsKey(character)) {
                int frequency = frequencies.get(character);
                frequencies.put(character, ++frequency);
            } else {
                frequencies.put(character, 1);
            }
        }
        return frequencies;
    }

    public Problem3TreeNode buildHuffman(String text) {
        Map<Character, Integer> frequencies = frequencyCount(text);

    }

    public Map<Character, Integer> genCode() {

    }
}
