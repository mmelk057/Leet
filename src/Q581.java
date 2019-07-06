import java.util.Arrays;

public class Q581 {
    public static int findUnsortedSubarray(int[] nums) {
        int[] sortedNums = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sortedNums);
        int lowerBound = 0;
        int upperBound = 0;
        //find lower bound..
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != sortedNums[i]) {
                lowerBound = i;
                break;
            } else if (i == nums.length - 1) {
                return 0;
            }
        }
        //find upper bound
        for (int i = lowerBound + 1; i < nums.length; i++) {
            if (nums[i] != sortedNums[i]) {
                upperBound = i + 1;
            }
        }
        return Math.abs(upperBound - lowerBound);
    }
}
