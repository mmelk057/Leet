public class Q326 {
    public static boolean isPowerOfThree(int n) {
        if (n == 0) {
            return false;
        }
        float powerOfThree = (float) (Math.log(n) / Math.log(3.0));
        return Math.pow(3.0, (double) powerOfThree) == (double) n;
    }
}
