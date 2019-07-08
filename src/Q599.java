import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Q599 {
    public static String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> listOneMapping = new HashMap<>();
        HashMap<String, Integer> listTwoMapping = new HashMap<>();
        HashMap<String, Integer> indexSumMapping = new HashMap<>();

        for (int i = 0; i < list1.length; i++) {
            listOneMapping.put(list1[i], i);
        }
        for (int i = 0; i < list2.length; i++) {
            listTwoMapping.put(list2[i], i);
        }
        String[] shorterList = list1.length > list2.length ? list2 : list1;
        boolean useListOneMapping = list1.length > list2.length;

        //Iterate through shorter list and compile a list of index Mapping
        for (int i = 0; i < shorterList.length; i++) {
            if (useListOneMapping) {
                if (listOneMapping.containsKey(shorterList[i])) {
                    indexSumMapping.put(shorterList[i], i + listOneMapping.get(shorterList[i]));
                }
            } else if (listTwoMapping.containsKey(shorterList[i])) {
                indexSumMapping.put(shorterList[i], i + listTwoMapping.get(shorterList[i]));
            }
        }

        int smallestIndexVal = 2001;
        for (int indexSum : indexSumMapping.values()) {
            if (indexSum < smallestIndexVal) {
                smallestIndexVal = indexSum;
            }
        }
        List<String> finalVals = new ArrayList<>();
        for (String word : indexSumMapping.keySet()) {
            if (indexSumMapping.get(word) == smallestIndexVal) {
                finalVals.add(word);
            }
        }

        return finalVals.toArray(new String[0]);
    }
}
