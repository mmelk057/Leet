public class Q66 {
    public static int[] plusOne(int[] digits) {
        int[] plusOne = new int[digits.length];
        boolean addOne = true;
        int consecutives = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (0 <= digits[i] && digits[i] < 9 && addOne) {
                plusOne[i] = digits[i] + 1;
                addOne = false;
            } else if (digits[i] == 9 && addOne) {
                plusOne[i] = 0;
                consecutives++;
                if (consecutives == digits.length) {
                    plusOne = new int[digits.length + 1];
                    plusOne[0] = 1;
                }
            } else {
                plusOne[i] = digits[i];
            }
        }
        return plusOne;
    }
}
