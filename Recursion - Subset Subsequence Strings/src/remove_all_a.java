public class remove_all_a {
    public static void main(String[] args) {
        String s = "baccad";
        System.out.println(removeA(s,0).toString());

        kunal("",s);

        System.out.println(skipApple("bcaapplede"));

        System.out.println(skipAppNotApple("bcaapplade  "));
    }

    static StringBuilder sb = new StringBuilder();
    static StringBuilder removeA(String s, int index){
        if (index == s.length()) {
            return sb;
        }

        if (s.charAt(index) != 'a') {
            sb.append(s.charAt(index));
        }

        return removeA(s,index+1);
    }

    static void kunal (String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if (ch == 'a') {
            kunal(p, up.substring(1));
        } else {
            kunal(p+ch, up.substring(1));
        }

    }


    static String skipApple(String s) {
        if (s.isEmpty()) {
            return "";
        }

        if (s.startsWith("apple")) {
            return skipApple(s.substring(5));
        } else {
            return s.charAt(0) + skipApple(s.substring(1));
        }
    }

    static String skipAppNotApple(String s) {
        if (s.isEmpty()) {
            return "";
        }

        if (s.startsWith("app") && !s.startsWith("apple")) {
            return skipAppNotApple(s.substring(3));
        } else {
            return s.charAt(0) + skipAppNotApple(s.substring(1));
        }
    }
}
