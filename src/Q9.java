public class Q9 {
    public static boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        char[] digitArr = String.valueOf(x).toCharArray();
        int firstIndex = 0;
        int secondIndex = digitArr.length - 1;
        //Basic window minimizing strategy
        while(firstIndex < secondIndex){
            if(digitArr[firstIndex] != digitArr[secondIndex]){
                return false;
            }
            firstIndex++;
            secondIndex--;
        }
        return true;
    }
}
