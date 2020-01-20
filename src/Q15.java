import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Q15 {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> output = new LinkedList();
        //We leave a 2-space window at the end of the array to account for
        // the high & low window boundaries
        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                int high = nums.length - 1;
                int low = i + 1;
                int sum = 0 - nums[i];

                //Window shrinking iterations
                while (low < high) {
                    if (nums[high] + nums[low] == sum) {
                        output.add(Arrays.asList(nums[i], nums[low], nums[high]));
                        //Ensure that low values do not repeat within window
                        while (low < high && nums[low] == nums[low + 1]) {
                            low++;
                        }
                        //Ensure that high values do not repeat within window
                        while (low < high && nums[high] == nums[high - 1]) {
                            high--;
                        }
                        high--;
                        low++;
                    } else if (nums[high] + nums[low] > sum) {
                        high--;
                    } else {
                        low++;
                    }
                }

            }
        }
        return output;
    }
}
