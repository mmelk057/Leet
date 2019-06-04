public class Q283 {
    public static int[] moveZeroes(int[] nums) {
        int realNumberPosCounter = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=0){
                if(i!=realNumberPosCounter) {
                    nums[realNumberPosCounter] = nums[i];
                    nums[i]=0;
                }
                realNumberPosCounter++;
            }
        }
        return nums;
    }
}
