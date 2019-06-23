import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Q500 {
    public static String[] findWords(String[] words) {
        char[][] charLayers = new char[][]{new char[]{'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'},
                new char[]{'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l'},
                new char[]{'z', 'x', 'c', 'v', 'b', 'n', 'm'}};
        HashMap<Character, Integer> quertyMapping = new HashMap<>();
        for (int i = 0; i < charLayers.length; i++) {
            char[] tempLayer = charLayers[i];
            for (int j = 0; j < tempLayer.length; j++) {
                quertyMapping.put(tempLayer[j], i);
            }
        }
        List<String> validVals = new ArrayList<>();
        for (String word : words) {
            String lowerCased = word.toLowerCase();
            int firstIndicator = quertyMapping.get(lowerCased.charAt(0));
            boolean isValid = true;
            for (char i : lowerCased.toCharArray()) {
                if (quertyMapping.get(i) != firstIndicator) {
                    isValid = false;
                    break;
                }
            }
            if (isValid) {
                validVals.add(word);
            }
        }
        return validVals.toArray(new String[0]);
    }
}
