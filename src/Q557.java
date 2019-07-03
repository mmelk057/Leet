public class Q557 {
    public static String reverseWords(String s) {
        String[] strings = s.split(" ");
        char[] reversedString = new char[s.length()];
        int lowerBound = 0;
        for (String word : strings) {
            char[] wordChars = word.toCharArray();
            for (int i = wordChars.length - 1; i >= 0; i--) {
                reversedString[lowerBound] = wordChars[i];
                lowerBound++;
            }
            if (lowerBound != reversedString.length) {
                reversedString[lowerBound] = ' ';
                lowerBound++;
            }
        }
        return new String(reversedString);
    }
}
