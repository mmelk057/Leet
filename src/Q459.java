public class Q459 {
    public static boolean repeatedSubstringPattern(String s) {
        if (s.length() == 1) return false;
        int length = s.length();
        char first = s.charAt(0);
        for (int i = 1; i < length; i++) {
            //Make sure that the length is divisible by the length of the substring being tested
            if (first == s.charAt(i) && (length % i == 0)) {
                boolean isRepeating = true;
                String comp = s.substring(0, i);
                //Check all subsequent substrings of the same length are equal. If not, then substring does not repeat
                for (int j = i; j < length; j += i) {
                    if (!comp.equals(s.substring(j, j + i))) {
                        isRepeating = false;
                        break;
                    }
                }
                if (isRepeating) {
                    return true;
                }
            }
        }
        return false;
    }
}
