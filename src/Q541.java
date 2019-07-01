public class Q541 {
    public static String reverseStr(String s, int k) {
        char[] characters = s.toCharArray();
        if (k > characters.length) {
            k = characters.length;
        }
        StringBuilder finalString = new StringBuilder();
        int lowerBound = 0;
        while (lowerBound < characters.length) {
            for (int i = lowerBound + (k - 1); i >= lowerBound && i < characters.length; i--) {
                finalString.append(characters[i]);
            }
            if (lowerBound + k > characters.length) {
                k = characters.length - lowerBound;
            }
            lowerBound += k;
            for (int i = lowerBound; i < (lowerBound + k) && i < characters.length; i++) {
                finalString.append(characters[i]);
            }
            lowerBound += k;
            if (lowerBound + k > characters.length) {
                k = characters.length - lowerBound;
            }
        }
        return finalString.toString();
    }
}
