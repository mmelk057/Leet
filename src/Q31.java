import java.util.Arrays;

public class Q31 {

    public static void nextPermutation(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return;
        }
        int plantingValIndex = nums.length - 1;
        int tempVal = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            plantingValIndex = i;
            if(nums[i] < tempVal) {
                break;
            }
            tempVal = nums[i];
        }

        int positionToSwap = plantingValIndex + 1;
        boolean positionSwapped = false;
        for(int i = plantingValIndex + 1; i < nums.length; i++){
            if(nums[i] > nums[plantingValIndex]){
                positionSwapped = true;
                positionToSwap = Math.min(nums[i], nums[positionToSwap]) == nums[plantingValIndex]
                        ? plantingValIndex : i;
            } else if (i == nums.length -1 && !positionSwapped){
                positionToSwap = i;
            }
        }

        int temp = nums[positionToSwap];
        nums[positionToSwap] = nums[plantingValIndex];
        nums[plantingValIndex] = temp;

        int[] subArray = Arrays.copyOfRange(nums, plantingValIndex + 1, nums.length);
        Arrays.sort(subArray);

        for(int i = 0; i < subArray.length; i++){
            nums[plantingValIndex + 1 + i] = subArray[i];
        }
    }
}
