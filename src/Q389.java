public class Q389 {
    public static char findTheDifference(String s, String t) {
        int firstSum = 0;
        int secondSum = 0;
        for (char character : s.toCharArray()) {
            firstSum += character;
        }
        for (char character : t.toCharArray()) {
            secondSum += character;
        }
        return (char) (secondSum - firstSum);
    }
}
