import java.util.ArrayList;
import java.util.List;

public class Q448 {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int[] values = new int[nums.length];
        List<Integer> finalVals = new ArrayList<>();
        for (int num : nums) {
            values[num - 1] = num;
        }
        for (int i = 0; i < values.length; i++) {
            if (values[i] == 0) {
                finalVals.add(i + 1);
            }
        }
        return finalVals;
    }
}
