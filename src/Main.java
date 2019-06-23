import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] values = Q500.findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"});
        Arrays.stream(values).forEach(val -> System.out.println(val));
    }
}
