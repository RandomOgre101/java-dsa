import java.util.ArrayList;

public class phone_no {
    public static void main(String[] args) {
        phone("", "23");

        System.out.println(phoneList("", "23"));
    }

    static void phone(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - '0';

        for (int i = (digit-1)*3; i < digit*3; i++) {
            char ch = (char) ('a' + i);

            phone(p+ch, up.substring(1));
        }
    }

    static ArrayList<String> phoneList(String p, String up){
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0';

        ArrayList<String> list = new ArrayList<>();

        for (int i = (digit-1)*3; i < digit*3; i++) {
            char ch = (char) ('a' + i);

            list.addAll(phoneList(p+ch, up.substring(1)));
        }

        return list;
    }
}
