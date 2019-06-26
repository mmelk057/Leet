public class Q507 {
    public static boolean checkPerfectNumber(int num) {
        int[] vals = new int[]{6, 28, 496, 8128, 33550336};
        for (int i = vals.length - 1; i >= 0; i--) {
            if (vals[i] == num) {
                return true;
            }
            vals[i]=0;
        }
        return false;
    }
}
