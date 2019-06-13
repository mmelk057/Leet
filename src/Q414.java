import java.util.ArrayList;
import java.util.Collections;

public class Q414 {
    public static int thirdMax(int[] nums) {
        ArrayList<Integer> valueList = new ArrayList<>();
        for (int num : nums) {
            if (valueList.size() < 3) {
                if (!valueList.contains(num)) {
                    valueList.add(num);
                    Collections.sort(valueList);
                }
            } else if (num > valueList.get(0) && !valueList.contains(num)) {
                valueList.remove(0);
                valueList.add(0, num);
                Collections.sort(valueList);
            }
        }
        return valueList.size() < 3 ? valueList.get(valueList.size() - 1) : valueList.get(0);
    }
}
