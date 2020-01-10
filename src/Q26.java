public class Q26 {
    public static int removeDuplicates(int[] nums) {
        if(nums.length == 0 ){
            return 0;
        }
        int duplicateCount = 0;
        int currentNum = nums[0];
        for(int i= 1 ; i< nums.length; i++) {
            if(nums[i] == currentNum) {
                duplicateCount++;
            } else {
                currentNum = nums[i];
                nums[i - duplicateCount] = currentNum;
            }
        }
        return nums.length - duplicateCount;
    }
}
