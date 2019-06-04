public class Q53 {
    public static int maxSubArray(int[] nums) {
        int max = 0;
        int res = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++) {
            //Check to see whether the value of the current index of the array ALONE is larger than
            //the addition of the (current max value + the current index). If so, that's the new max value.
            max = Math.max(nums[i], max + nums[i]);
            //The res value keeps track of the OVERALL max value. Not the temporary one.
            //The temporary max value is that which replaces the previous max value
            res = Math.max(res, max);
        }
        return  res;
    }
}
