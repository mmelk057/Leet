public class Q492 {
    public static int[] constructRectangle(int area) {
        int diff = area - 1;
        int limit = (int) Math.sqrt(area);
        for (int i = limit; i > 0; i--) {
            if (area % i == 0) {
                int dividend = area / i;
                if ((dividend >= i && (dividend - i) < diff) || (i >= dividend && (i - dividend) < diff)) {
                    return new int[]{dividend < i ? i : dividend, dividend < i ? dividend : i};
                }
            }
        }
        return new int[]{area, 1};
    }
}
