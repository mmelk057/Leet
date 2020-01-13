public class Main {
    public static void main(String[] args) {
        System.out.println(Q9.isPalindrome(121));
        for(int i = -9; i < 10000 ; i++){
            boolean isPalindrome = Q9.isPalindrome(i);
            if(isPalindrome){
                System.out.println("This is the palindrome: "+ i);
            }

        }
    }
}
