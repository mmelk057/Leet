import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] values = Q506.findRelativeRanks(new int[]{2,1,3,4});
        Arrays.stream(values).forEach(string -> System.out.println(string));
    }
}
