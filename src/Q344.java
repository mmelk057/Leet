public class Q344 {
    public static void reverseString(char[] s) {
        int counter=0;
        while(true) {
            if(counter==s.length/2){
                break;
            }
            char temp = s[counter];
            s[counter] = s[(s.length-1) - counter];
            s[(s.length-1) - counter] = temp;
            counter++;
        }
    }
}
