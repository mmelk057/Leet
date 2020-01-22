public class Q209 {

    public static int minSubArrayLen(int s, int[] nums) {
        int smallestLength = Integer.MAX_VALUE;

        int left = 0;
        int valSum = 0;

        for(int i= 0; i< nums.length; i++){
            valSum+= nums[i];

            while(valSum >= s){
                smallestLength = Math.min(smallestLength, i - left + 1);

                valSum -= nums[left];
                left++;
            }
        }

        return smallestLength == Integer.MAX_VALUE ? 0 : smallestLength;
    }
}
