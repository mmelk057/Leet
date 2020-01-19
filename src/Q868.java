public class Q868 {
    public static int binaryGap(int N) {
        int highestStreak = 0;
        int currentStreak = 0;
        while (N > 0) {
            if (N % 2 == 1) {
                if(currentStreak > highestStreak){
                    highestStreak = currentStreak;
                }
                currentStreak = 1;
            } else {
                if(currentStreak != 0) {
                    currentStreak++;
                }
            }
            N /= 2;
        }
        return highestStreak;
    }
}
