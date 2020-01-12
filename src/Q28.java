public class Q28 {
    public static int strStr(String haystack, String needle) {
        if(needle == null || needle.isEmpty() || haystack.equals(needle)){
            return 0;
        }
        for(int i = needle.length(); i <= haystack.length(); i++){
            String subHaystack = haystack.substring(i - needle.length(), i);
            if(subHaystack.equals(needle)){
                return i - needle.length();
            }
        }
        return -1;
    }
}
