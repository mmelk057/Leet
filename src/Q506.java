import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Q506 {
    public static String[] findRelativeRanks(int[] nums) {
        String[] finalVals = new String[nums.length];
        ArrayList<String> allRankings = new ArrayList<>(Arrays.asList("Gold Medal", "Silver Medal", "Bronze Medal"));
        HashMap<Integer, String> rankingMapping = new HashMap<>();

        //Find top three rankings
        List<Integer> list = new ArrayList<>();
        for (int i : nums) {
            list.add(i);
        }
        Collections.sort(list, Collections.reverseOrder());
        int externalRankingCounter = 4;
        for (Integer i : list) {
            if (!allRankings.isEmpty()) {
                rankingMapping.put(i, allRankings.get(0));
                allRankings.remove(0);
            } else {
                rankingMapping.put(i, String.valueOf(externalRankingCounter));
                externalRankingCounter++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            finalVals[i] = rankingMapping.get(nums[i]);
        }
        return finalVals;
    }
}
