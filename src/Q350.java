import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Q350 {
    public static int[] intersect(int[] nums1, int[] nums2) {
        LinkedList<Integer> valueList = new LinkedList();
        int[] chosen;
        int[] notChosen;
        if (nums1.length == nums2.length) {
            HashSet<Integer> numSetOne = new HashSet<>();
            HashSet<Integer> numSetTwo = new HashSet<>();
            for (int i : nums1) {
                numSetOne.add(i);
            }
            for (int i : nums2) {
                numSetTwo.add(i);
            }
            if (numSetOne.size() == numSetTwo.size()) {
                chosen = nums1;
                notChosen = nums2;
            } else if (numSetOne.size() < numSetTwo.size()) {
                chosen = nums1;
                notChosen = nums2;
            } else {
                chosen = nums2;
                notChosen = nums1;
            }
        } else if (nums1.length < nums2.length) {
            chosen = nums1;
            notChosen = nums2;
        } else {
            chosen = nums2;
            notChosen = nums1;
        }
        for (int i : chosen) {
            valueList.add(i);
        }
        List<Integer> nums = new ArrayList<>();
        for (int i : notChosen) {
            if (valueList.isEmpty()) {
                break;
            } else if (valueList.getFirst() == i) {
                nums.add(i);
                valueList.removeFirst();
            }
        }
        int[] finalResult = new int[nums.size()];
        for (int i = 0; i < nums.size(); i++) {
            finalResult[i] = nums.get(i);
        }
        return finalResult;
    }
}
