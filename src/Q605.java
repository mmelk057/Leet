public class Q605 {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int plot = 1;
        for (int flower : flowerbed) {
            if (flower == 0) {
                plot++;
            } else {
                plot = 0;
            }

            if (plot == 3) {
                n--;
                plot = 1;
            }

        }
        if (plot == 2) {
            n--;
        }
        return n <= 0;
    }
}
