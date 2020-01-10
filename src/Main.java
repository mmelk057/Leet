public class Main {
    public static void main(String[] args) {
        int[] arrayValue = new int[]{1,1,2,4,4,6,7};
        System.out.print(Q26.removeDuplicates(arrayValue));
        for(int i = 0; i < arrayValue.length ; i++) {
            System.out.println(arrayValue[i]);
        }
    }
}
