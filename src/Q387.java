public class Q387 {
    public static int firstUniqChar(String s) {
        char[] values = new char[128];
        char[] inputArray = s.toCharArray();
        for (int i = 0; i < inputArray.length; i++) {
            values[inputArray[i]] += inputArray[i];
        }
        for (int i = 0; i < inputArray.length; i++) {
            if (values[inputArray[i]] == inputArray[i]) {
                return i;
            }
        }
        return -1;
    }
}
