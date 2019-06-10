public class Q434 {
    public static int countSegments(String s) {
        boolean isSequence = false;
        int segementCount = 0;
        for (char character : s.toCharArray()) {
            if (character != ' ' && !isSequence) {
                segementCount++;
                isSequence = true;
            } else if (character == ' ' && isSequence) {
                isSequence = false;
            }
        }
        return segementCount;
    }
}
