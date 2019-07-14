public class Q665 {
    public static boolean checkPossibility(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                count++;
                if (count == 2) {
                    return false;
                }
                if (i > 0) {
                    if (nums[i + 1] <= nums[i - 1]) {
                        nums[i + 1] = nums[i];
                    }
                }
            }
        }
        return true;
    }
}
