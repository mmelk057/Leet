public class Q645 {
    public static int[] findErrorNums(int[] nums) {
        boolean[] isValIncluded = new boolean[nums.length + 1];
        int duplicateNum = -1;
        int missingNum = -1;
        for (int i = 0; i < nums.length; i++) {
            if (isValIncluded[nums[i]]) {
                duplicateNum = nums[i];
            }
            isValIncluded[nums[i]] = true;
        }
        for (int i = 1; i < isValIncluded.length; i++) {
            if (!isValIncluded[i]) {
                missingNum = i;
                break;
            }
        }
        return new int[]{duplicateNum, missingNum};
    }
}
