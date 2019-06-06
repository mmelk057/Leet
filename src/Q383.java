public class Q383 {
    public static boolean canConstruct(String ransomNote, String magazine) {
        //Encapsulates all ASCII character values
        int[] quantityVals = new int[256];
        for (char i : magazine.toCharArray()) {
            quantityVals[i] += i;
        }
        for (char i : ransomNote.toCharArray()) {
            if (quantityVals[i] == 0) {
                return false;
            } else {
                quantityVals[i] -= i;
            }
        }
        return true;
    }
}
