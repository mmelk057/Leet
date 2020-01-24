import java.util.Arrays;

public class Q16 {

    public static int threeSumClosest(int[] nums, int target) {
        if (nums.length < 3) {
            int tempSum = 0;
            for(int i: nums){
                tempSum+=i;
            }
            return tempSum;
        }
        Arrays.sort(nums);
        Integer minSum = null;
        for (int i = 0; i < nums.length - 2; i++) {
            int low = i + 1;
            int high = nums.length - 1;
            int sum = target - nums[i];

            while (low < high) {
                int currSum = nums[i] + nums[low] + nums[high];
                int currentDistance = Math.abs(target - currSum);
                if(minSum != null){
                    int minDistance = Math.abs(target - minSum);
                    minSum = Math.min(currentDistance, minDistance) == currentDistance ? currSum : minSum;
                } else {
                    minSum = currSum;
                }
                if (nums[low] + nums[high] == sum) {
                    return target;
                } else if (nums[low] + nums[high] > sum) {
                    high--;
                } else if (nums[low] + nums[high] < sum) {
                    low++;
                }
            }
        }
        return minSum;

    }
}
