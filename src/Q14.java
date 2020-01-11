public class Q14 {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        //the prefix can only be as big as the smallest string
        int smallestLength = strs[0].length();
        String prefix = "";
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < smallestLength) {
                smallestLength = strs[i].length();
            }
        }
        for (int i = 0; i < smallestLength; i++) {
            char tempChar = strs[0].toCharArray()[i];
            for(int j = 1; j < strs.length ; j++){
                if(strs[j].toCharArray()[i] != tempChar){
                    return prefix;
                }
            }
            prefix = prefix + tempChar;
        }
        return prefix;
    }
}
