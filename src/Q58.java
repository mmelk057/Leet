public class Q58 {
    public static int lengthOfLastWord(String s) {
        char[] characters = s.toCharArray();
        int wordLength = 0;
        for (int i = characters.length - 1; i >= 0; i--) {
            if (characters[i] != ' ') {
                wordLength++;
            } else if (characters[i] == ' ' && wordLength > 0) {
                break;
            }

        }
        return wordLength;
    }
}
