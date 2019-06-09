public class Q400 {
    public static int findNthDigit(int n) {
        n--;
        int start = 1;
        int size = 1;
        while (n / 9 / size >= start) {
            n -= 9 * start * size;
            start *= 10;
            size++;
        }
        int number = start + n / size;
        for (int i = n % size; i < size - 1; i++) {
            number /= 10;
        }
        return number % 10;
    }
}
