import java.util.*;

public class Functions_Grades {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(check(x));

    }

    static String check(int x){
        int percentage = x/10;
        return switch (percentage) {
            case 9 -> "Grade AA";
            case 8 -> "Grade AB";
            case 7 -> "Grade BB";
            case 6 -> "Grade BC";
            case 5 -> "Grade CD";
            case 4 -> "Grade DD";
            default -> "Fail";
        };
    }

}
