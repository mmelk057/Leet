import java.util.HashMap;

public class Q496 {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] finalVals = new int[nums1.length];
        HashMap<Integer, Integer> indexMapping = new HashMap<>();
        //Map out Indexes for nums2
        for (int i = 0; i < nums2.length; i++) {
            indexMapping.put(nums2[i], i);
        }
        for (int i = 0; i < nums1.length; i++) {
            int currentIndex = indexMapping.get(nums1[i]);
            int temp = -1;
            for (int j = currentIndex + 1; j < nums2.length; j++) {
                if (nums2[j] > nums1[i]) {
                    temp=nums2[j];
                    break;
                }
            }
            finalVals[i] = temp;
        }

        return finalVals;
    }
}
