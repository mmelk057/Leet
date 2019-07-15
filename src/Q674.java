public class Q674 {
    public static int findLengthOfLCIS(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int maxCount = 1;
        int tempCount = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                tempCount++;
                if (tempCount > maxCount) {
                    maxCount = tempCount;
                }
            } else {
                tempCount = 1;
            }
        }
        return maxCount;
    }
}
