import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Q594 {
    public static int findLHS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int arrCnt = 0;
        Map<Integer, Integer> numsMapping = new HashMap<>();
        for (int num : nums) {
            if (numsMapping.containsKey(num)) {
                int currentVal = numsMapping.get(num);
                numsMapping.put(num, currentVal + 1);
            } else {
                numsMapping.put(num, 1);
            }
        }
        for (int key : numsMapping.keySet()) {
            if (numsMapping.containsKey(key + 1)) {
                int tempCnt = numsMapping.get(key) + numsMapping.get(key + 1);
                arrCnt = tempCnt > arrCnt ? tempCnt : arrCnt;
            }
        }
        return arrCnt;
    }
}
