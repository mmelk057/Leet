public class Main {
    public static void main(String[] args) {
        int[] temp1 = new int[]{1,2,2,1};
        int[] temp2 = new int[]{2,2};
        int[] result = Q350.intersect(temp1, temp2);
        for (int i : result) {
            System.out.println(i);
        }
    }
}
