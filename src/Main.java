public class Main {
    public static void main(String[] args) {
        int[] arrayValue = new int[]{2,6,3,4,2,5,2};
        System.out.println(Q27.removeElement(arrayValue, 2));
        System.out.println("Here are the array values: ");
        for(int i: arrayValue){
            System.out.println(i);
        }
    }
}
