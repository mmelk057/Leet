public class Q643 {
    public static double findMaxAverage(int[] nums, int k) {
        int currentSum = 0;
        int maxSum = 0;
        int windowCounter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i - windowCounter != k) {
                currentSum += nums[i];
                maxSum = currentSum;
            } else {
                int tempSum = currentSum - nums[windowCounter];
                currentSum = tempSum + nums[i];
                maxSum = currentSum > maxSum ? currentSum : maxSum;
                windowCounter++;
            }
        }
        return ((double) maxSum) / k;
    }
}
