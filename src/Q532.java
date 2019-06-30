import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Q532 {
    public static int findPairs(int[] nums, int k) {
        if (k == 0) {
            Set<Integer> finalSet = new HashSet<>();
            HashMap<Integer, Boolean> uniquePairs = new HashMap<>();
            for (int num : nums) {
                if (finalSet.contains(num)) {
                    uniquePairs.put(num, true);
                } else {
                    finalSet.add(num);
                }
            }
            return uniquePairs.size();
        } else if (k < 0) {
            return 0;
        }
        HashMap<Integer, Boolean> mappedVals = new HashMap<>();
        for (int num : nums) {
            mappedVals.put(num, true);
        }
        HashMap<Integer, Boolean> uniquePairs = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int val = nums[i] - k;
            if (!uniquePairs.containsKey(nums[i] + val) && mappedVals.containsKey(val)) {
                uniquePairs.put(nums[i] + val, true);
            }
        }
        return uniquePairs.size();
    }
}
