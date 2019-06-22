import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] values = Q496.nextGreaterElement(new int[]{4,1,2},new int[]{1,3,4,2});
        Arrays.stream(values).forEach(val -> System.out.println(val));
    }
}
