import java.util.HashMap;

public class Q345 {
    public static String reverseVowels(String s) {
        HashMap vowelMapping = new HashMap();
        vowelMapping.put('a', true);
        vowelMapping.put('A', true);
        vowelMapping.put('e', true);
        vowelMapping.put('E', true);
        vowelMapping.put('i', true);
        vowelMapping.put('I', true);
        vowelMapping.put('o', true);
        vowelMapping.put('O', true);
        vowelMapping.put('u', true);
        vowelMapping.put('U', true);
        char[] inputCharray = s.toCharArray();
        int frontCounter = 0;
        int backCounter = inputCharray.length - 1;
        boolean countFront = true;
        boolean doSwap = false;
        while (backCounter > frontCounter) {
            char currentInput = inputCharray[countFront ? frontCounter : backCounter];
            boolean isVowel = vowelMapping.containsKey(currentInput) ||
                    vowelMapping.containsKey(Character.toUpperCase(currentInput));
            if (isVowel && doSwap) {
                char temp = inputCharray[frontCounter];
                inputCharray[frontCounter] = inputCharray[backCounter];
                inputCharray[backCounter] = temp;
                frontCounter++;
                backCounter--;
                doSwap = !doSwap;
                continue;
            } else if (isVowel) {
                countFront = !countFront;
                doSwap = !doSwap;
                continue;
            }
            if (countFront) {
                frontCounter++;
            } else {
                backCounter--;
            }
        }
        return String.valueOf(inputCharray);
    }
}
