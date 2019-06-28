public class Q520 {
    public static boolean detectCapitalUse(String word) {
        char[] chars = word.toCharArray();
        if(chars.length==1){
            return true;
        }
        int upperCnt = 0;
        for (int i = 0; i < chars.length; i++) {
            if (65 <= chars[i] && chars[i] <= 90) {
                upperCnt++;
            }
        }
        return upperCnt == chars.length || upperCnt==0 || (upperCnt == 1 && (65 <= chars[0] && chars[0] <= 90));
    }
}
