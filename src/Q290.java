import java.util.HashMap;

import static java.util.Objects.hash;

public class Q290 {
    public static boolean wordPattern(String pattern, String str) {
        HashMap<Integer, Integer> wordMappings = new HashMap<>();
        String[] words = str.split(" ");
        char[] patternLetters = pattern.toCharArray();
        if (words.length != patternLetters.length) {
            return false;
        }
        //Map letters
        for (int i = 0; i < patternLetters.length; i++) {
            if (wordMappings.get(hash(patternLetters[i])) == null && !wordMappings.containsValue(hash(words[i]))) {
                wordMappings.put(hash(patternLetters[i]), hash(words[i]));
            }
        }
        for (int i = 0; i < patternLetters.length; i++) {
            Integer hashCode = wordMappings.get(hash(patternLetters[i]));
            if (hashCode == null || hashCode != hash(words[i])) {
                return false;
            }
        }
        return true;
    }
}
