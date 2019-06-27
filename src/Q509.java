public class Q509 {
    public static int fib(int N) {
        int currentSeq, tempLastItem, tempSum;
        currentSeq = tempLastItem = tempSum = 0;
        for (int i = 0; i <= N; i++) {
            if (i == 1) {
                currentSeq++;
                tempSum++;
            }
            if (i == 1 || i == 0) {
                continue;
            }
            currentSeq = tempSum;
            tempLastItem = tempSum - tempLastItem; //Nearest number
            tempSum = currentSeq + tempLastItem;
        }
        return currentSeq;
    }
}
