import java.util.Arrays;

public class stringMethods {
    public static void main(String[] args) {
//        String name = "Nicolo Barella";
//        System.out.println(Arrays.toString(name.toCharArray()));

        // Palindrome

        String s = null;
        System.out.println(palindrome(s));

    }

    static boolean palindrome(String s){

        if(s == null){
            return true;
        }

        int start = 0;
        int end = s.length()-1;
        s = s.toLowerCase();


        while(start <= end){
            if(s.charAt(start) == s.charAt(end)){
                start++;
                end--;
            }else{
                return false;
            }
        }
        return true;
    }
}
