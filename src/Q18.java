import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Q18 {

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> output = new LinkedList();

        for(int i= 0; i < nums.length - 3; i++){
            if(i == 0 || (i > 0 && nums[i] != nums[i-1])) {
                for (int j = i + 1; j < nums.length - 2; j++) {
                    //Prevent 'j' value duplicates
                    if (j == i + 1 || (j > (i + 1) && nums[j] != nums[j - 1])) {
                        int low = j + 1;
                        int high = nums.length - 1;
                        //Subtract the i and j nums indicies from the target to figure out the ideal sum
                        int sum = target - nums[i] - nums[j];

                        //Window approach --> Shrink high and low window accordingly
                        while (low < high) {
                            if (nums[low] + nums[high] == sum) {
                                output.add(Arrays.asList(nums[i], nums[j], nums[low], nums[high]));
                                //Skips through duplicates of high value within window context
                                while (low < high && nums[high] == nums[high - 1]) {
                                    high--;
                                }
                                //Skips through duplicates of high value within window context
                                while (low < high && nums[low] == nums[low + 1]) {
                                    low++;
                                }
                                high--;
                                low++;
                            } else if (nums[low] + nums[high] < sum) {
                                low++;
                            } else {
                                high--;
                            }
                        }
                    }
                }
            }
        }
        return output;

    }
}
