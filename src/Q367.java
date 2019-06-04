public class Q367 {
    public static boolean isPerfectSquare(int num) {
        int counter = 1;
        while (true) {
            if (num % counter == 0 && (num / counter) == counter) {
                return true;
            } else if ((num / counter) < counter) {
                return false;
            }
            counter++;
        }
    }
}
