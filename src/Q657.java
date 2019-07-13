public class Q657 {
    public static boolean judgeCircle(String moves) {
        if (moves.length() % 2 != 0){
            return false;
        }
        int x = 0;
        int y = 0;
        for (char move : moves.toCharArray()) {
            if (move == 'U') {
                y++;
            } else if (move == 'D') {
                y--;
            } else if (move == 'R') {
                x++;
            } else if (move == 'L') {
                x--;
            }
        }
        return (x == y && x == 0);
    }
}
