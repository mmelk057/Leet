public class Q441 {
    public static int arrangeCoins(int n) {
        int counter = 1;
        while (true) {
            n -= counter;
            if (n < 0) {
                return counter-1;
            }
            counter++;
        }
    }
}
