import java.util.ArrayList;
import java.util.List;

public class Q482 {
    public static String licenseKeyFormatting(String S, int K) {
        char[] values = S.toCharArray();
        int firstSegment = 0;
        for (char character : values) {
            if (character != '-') {
                firstSegment++;
            }
        }
        firstSegment = firstSegment % K;
        StringBuilder finalLicenseKey = new StringBuilder();
        List<String> allCodes = new ArrayList<>();
        boolean begin = (firstSegment == 0);
        int count = 0;
        for (char character : values) {
            //if we're beginning to format
            if (character != '-') {
                finalLicenseKey.append(character);
                count++;
            }

            if (begin && count == K) {
                allCodes.add(finalLicenseKey.toString());
                finalLicenseKey = new StringBuilder();
                count = 0;
            }

            if (!begin && count == firstSegment) {
                begin = true;
                allCodes.add(finalLicenseKey.toString());
                finalLicenseKey = new StringBuilder();
                count = 0;
            }
        }
        return String.join("-", allCodes).toUpperCase();
    }
}
