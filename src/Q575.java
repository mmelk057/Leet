import java.util.Arrays;

public class Q575 {
    public static int distributeCandies(int[] candies) {
        Arrays.sort(candies);
        int brother = 1;
        int previousOne = candies[0];
        int counter = 1;
        while (brother < (candies.length / 2) && counter < candies.length) {
            if (previousOne != candies[counter]) {
                brother++;
                previousOne = candies[counter];
            }
            counter++;
        }
        return brother;
    }
}
