
/*
Given a string find its first uppercase letter
Examples :

Input : geeksforgeeKs
Output : K

Input  : geekS
Output : S
 */

public class first_Uppercase {
    public static void main(String[] args) {
        String str = "geeksforgeeKs";
        String str1 = "geekS";
        System.out.println(upper(str, 0));
        System.out.println(upper(str1,0));
    }

    static char upper(String s, int index) {
        if(index == s.length()){
            return s.charAt(0);
        }

        if (Character.isUpperCase(s.charAt(index))) {
            return s.charAt(index);
        }
        return upper(s, index+1);
    }
}
