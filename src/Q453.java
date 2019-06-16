import java.util.Arrays;
import java.util.stream.IntStream;

public class Q453 {
    /**
     * The idea is to use the minimum value as the baseline for total equality
     *
     * @param nums
     * @return
     */
    public static int minMoves(int[] nums) {
        int minMovesCount = 0;
        Arrays.sort(nums);
        int minElem = nums[0];
        for (int i = 0; i < nums.length; i++) {
            minMovesCount += nums[i] - minElem;
        }
        return minMovesCount;
    }
}
