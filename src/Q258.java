public class Q258 {
    public static int addDigits(int num) {
        int total = num;
        while(total >= 10){
            int temp = 0;
            while(total != 0){
                temp += total % 10;
                total = total/10;
            }
            total = temp;
        }
        return total;
    }
}
