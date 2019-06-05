/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class Q374 {
    public static int guessNumber(int n) {
        int higher = n;
        int lower = 1;
        int mid = lower + (higher-lower) / 2;
        int guessResult = guess(mid);
        if(guess(higher)==0){
            return higher;
        }
        while (guessResult != 0) {
            if (guessResult == -1) {
                higher = mid - 1;
            } else if (guessResult == 1) {
                lower = mid + 1;
            }
            mid = lower + (higher-lower) / 2;
            guessResult = guess(mid);
        }
        return mid;
    }

    /**
     * Dummy method to mock the guess API
     *
     * @param num
     * @return
     */
    public static int guess(int num) {
        return -1;
    }
}
