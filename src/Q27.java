public class Q27 {
    public static int removeElement(int[] nums, int val) {
        int tailendPosition = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if(tailendPosition < i ){
                break;
            }
            else if(nums[i] == val ){
                nums[i] = nums[tailendPosition];
                //Collect filtered values at tail end of array
                nums[tailendPosition] = 0;
                tailendPosition--;
                //The placeholder value may also be a val that we wish to remove
                i--;
            }
        }
        return tailendPosition + 1;
    }
}
