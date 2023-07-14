public class palindrome {
    public static void main(String[] args) {
        System.out.println(palindrome(124521));
    }

    static boolean palindrome(int n){
        if(n == rev(n)){
            return true;
        }
        return false;
    }

    static int rev(int n){
        if(n<10){
            return n;
        }

        return (int) ((n%10) * Math.pow(10,(int)Math.log10(n)) + rev(n/10));
    }
}
