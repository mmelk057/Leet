public class Q686 {
    public static int repeatedStringMatch(String A, String B) {
        if(B.length() == A.length()){
            if(B.indexOf(A)==0) return 1;
        }

        StringBuilder sb = new StringBuilder();

        if(B.length() < A.length()){
            if(A.indexOf(B)!=-1) return 1;
            sb.append(A);
            sb.append(A);
            if(sb.toString().contains(B)){
                return 2;
            }
            return -1;
        }

        int num = (B.length() / A.length()) + 2;

        for(int i = 1; i <= num; i++){
            sb.append(A);
            if(sb.toString().contains(B)){
                return i;
            }
        }

        return -1;
    }
}
