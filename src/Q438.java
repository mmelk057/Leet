import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Q438 {
    public static List<Integer> findAnagrams(String s, String p) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : p.toCharArray()) {
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }

        int count = map.size();

        List<Integer> list = new LinkedList<>();
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            while (j < s.length()) {
                char currentChar = s.charAt(j);
                if (count == 0) {
                    break;
                } else if (map.containsKey(currentChar)) {
                    map.put(currentChar, map.get(currentChar) - 1);
                    if (map.get(currentChar) == 0) {
                        count--;
                    }
                }

                j++;
            }

            if (count == 0 && (j - i == p.length())) {
                list.add(i);
            }

            char removeChar = s.charAt(i);
            if (map.containsKey(removeChar)) {
                map.put(removeChar, map.get(removeChar) + 1);

                if (map.get(removeChar) > 0) {
                    count++;
                }
            }
        }

        return list;
    }
}
