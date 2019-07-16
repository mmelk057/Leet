public class Q680 {
    public static boolean validPalindrome(String s) {
        int max = 1, len = s.length();
        char[] array = s.toCharArray();
        int i = 0, j = len - 1;
        if (len == 2) {
            return true;
        }
        while (i < len && i <= j) {
            if (array[i] == array[j]) {
                i++;
                j--;
                continue;
            }
            if (array[i + 1] == array[j] && array[i + 2] == array[j - 1] && max == 1) {
                max = 0;
                i++;
            } else if (array[i] == array[j - 1] && array[i + 1] == array[j - 2] && max == 1) {
                max = 0;
                j--;
            } else if (i == j - 1) {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }
}
