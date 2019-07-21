public class Q696 {
    public static int countBinarySubstrings(String s) {
        int result = 0;
        int previousCount = 0;
        int currentCount = 1;
        char prev = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != prev) {
                result += Math.min(currentCount, previousCount);
                previousCount = currentCount;
                currentCount = 1;
            } else{
                currentCount++;
            }
            prev = c;
        }
        result += Math.min(currentCount, previousCount);
        return result;
    }
}
