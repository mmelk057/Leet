public class Q35 {
    public static int searchInsert(int[] nums, int target) {
        int high = nums.length - 1;
        int low = 0;
        int mid = high / 2;
        while(mid > low){
            if(target > nums[mid]){
                low = mid;
                mid = ((high - low) / 2) + low;
            } else if (target < nums[mid]){
                high = mid;
                mid = ((high - low) / 2) + low;
            } else {
                return mid;
            }
        }
        if(nums[mid] == target){
            return mid;
        } else if(target < nums[mid]){
            if(target < nums[0]){
                return 0;
            }
            return mid;
        } else {
            if(target > nums[nums.length - 1]){
                return nums.length;
            }
            return mid + 1;
        }
    }
}
