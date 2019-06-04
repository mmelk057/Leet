public class Q303 {

    int[] sumMappings;

    public Q303(int[] nums) {
        this.sumMappings = new int[nums.length];
        int previousSum = 0;
        for (int i = 0; i < nums.length; i++) {
            previousSum += nums[i];
            sumMappings[i] = previousSum;
        }
    }

    public int sumRange(int i, int j) {
        if ((i - 1) < 0) {
            return sumMappings[j];
        }
        else{
            return sumMappings[j] - sumMappings[i-1];
        }
    }
}
