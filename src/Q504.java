public class Q504 {
    public static String convertToBase7(int num) {
        StringBuilder remainders = new StringBuilder();
        if (num == 0) {
            return "0";
        }
        boolean isNeg = num < 0;
        num = Math.abs(num);
        while (num != 0) {
            remainders.insert(0, num % 7);
            num /= 7;
        }
        if (isNeg) {
            remainders.insert(0, "-");
        }
        return remainders.toString();
    }
}
