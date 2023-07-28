import java.util.*;

public class subsequence {
    public static void main(String[] args) {
        String up = "abc";
        System.out.println(sub1("", "abc"));
    }

    static void sub (String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        sub(p+ch, up.substring(1));
        sub(p, up.substring(1));
    }

    static ArrayList<String> sub1 (String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> left = sub1(p+ch, up.substring(1));
        ArrayList<String> right =  sub1(p, up.substring(1));

        left.addAll(right);

        return left;
    }
}
