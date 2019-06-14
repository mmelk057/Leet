import java.util.HashMap;

public class Q415 {
    public static String addStrings(String num1, String num2) {
        StringBuilder stringBuilder = new StringBuilder();
        boolean carry = false;
        int largerLength = (num1.length() < num2.length() ? num2.length() : num1.length());
        for (int i = 1; i <= largerLength; i++) {
            int num1Sum = 0;
            int num2Sum = 0;
            int tempSum;
            if (num1.length() - i >= 0) {
                num1Sum= num1.charAt(num1.length() - i)-'0';
            }
            if (num2.length() - i >= 0) {
                num2Sum = num2.charAt(num2.length() - i)-'0';
            }

            if (num1Sum + num2Sum > 9) {
                tempSum = (num1Sum + num2Sum + (carry ? 1 : 0)) % 10;
                stringBuilder.append(tempSum);
                carry = true;
            } else {
                tempSum = num1Sum + num2Sum + (carry ? 1 : 0);
                stringBuilder.append(tempSum % 10);
                carry = tempSum >= 10;
            }
        }
        if (carry) {
            stringBuilder.append("1");
        }
        return stringBuilder.reverse().toString();
    }
}
