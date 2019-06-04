public class Q70 {
    public static int climbStairs(int n) {
        return (int) (1 + Math.pow(2, n - 2));
    }
}
