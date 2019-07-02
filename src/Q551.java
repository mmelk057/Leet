public class Q551 {
    public static boolean checkRecord(String s) {
        char[] characters = s.toCharArray();
        boolean oneAbsent = false;
        int lateCount = 0;
        for (char character : characters) {
            if (character == 'A') {
                if (oneAbsent) {
                    return false;
                }
                oneAbsent = true;
                lateCount = 0;
            } else if (character == 'L') {
                lateCount++;
                if (lateCount > 2) {
                    return false;
                }
            } else {
                lateCount = 0;
            }
        }
        return true;
    }
}
