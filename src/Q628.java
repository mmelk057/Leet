public class Q628 {
    public static int maximumProduct(int[] nums) {
        int min1, min2, max1, max2, max3;
        min1 = min2 = Integer.MAX_VALUE;
        max1 = max2 = max3 = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max3 = max2;
                max2 = num;
            } else if (num > max3) {
                max3 = num;
            }
            // find the 2 min values
            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2)
                min2 = num;
        }
        return (min1 * min2 * max1) > (max1 * max2 * max3) ? min1 * min2 * max1 : max1 * max2 * max3;
    }
}
