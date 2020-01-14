public class Q13 {
    public static int romanToInt(String s) {
        char[] romanCharArr = s.toCharArray();
        int totalSum = 0;
        for (int i = romanCharArr.length - 1; i >= 0; i -= 1) {
            int rightVal = convertNumeral(romanCharArr[i]);
            if (i - 1 >= 0) {
                int leftVal = convertNumeral(romanCharArr[i - 1]);
                int tempVal = -1;
                for (int j = 0; j < 3; j++) {
                    int multiplier = (int) Math.pow(10, j);
                    if ((rightVal == 5 * multiplier || rightVal == 10 * multiplier) && leftVal == multiplier) {
                        tempVal = rightVal - leftVal;
                        break;
                    }
                }
                if (tempVal == -1) {
                    totalSum += rightVal;
                } else {
                    totalSum += tempVal;
                    i--;
                }
            } else {
                totalSum += rightVal;
            }
        }
        return totalSum;
    }

    public static int convertNumeral(char numeral) {
        switch (numeral) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
