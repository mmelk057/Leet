import java.util.HashMap;

public class Q1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> remainders = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (remainders.get(nums[i]) != null) {
                return new int[]{remainders.get(nums[i]), i};
            }
            int remainder = target - nums[i];
            remainders.put(remainder, i);
        }
        return null;
    }
}
