public class Q485 {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int tempCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                tempCount++;
            } else {
                if (tempCount > maxCount) {
                    maxCount = tempCount;
                }
                tempCount = 0;
            }
            if (i == nums.length - 1 && tempCount > maxCount) {
                maxCount = tempCount;
            }
        }
        return maxCount;
    }
}
