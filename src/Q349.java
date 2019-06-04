import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Q349 {
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Boolean> valMap = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            valMap.put(nums1[i], true);
        }
        List<Integer> finalResults = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
            if (valMap.containsKey(nums2[i])) {
                //This is to prevent duplicates from bleeding out
                valMap.remove(nums2[i]);
                finalResults.add(nums2[i]);
            }
        }
        int[] result = new int[finalResults.size()];
        for (int i = 0; i < finalResults.size(); i++) {
            result[i] = finalResults.get(i);
        }
        return result;
    }
}
