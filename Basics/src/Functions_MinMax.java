import java.util.*;

public class Functions_MinMax {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();


        System.out.println("The maximum number is: "+max(a,b,c));
        System.out.println("The minimum number is: "+min(a,b,c));
    }

    static int max(int a, int b, int c){
        int max = 0;
        max = a;

        if(b>max){
            max =b;
        }

        if (c>max) {
            max = c;
        }
        return max;

    }

    static int min(int a, int b, int c){
        int min = 0;
        min = a;

        if(b<min){
            min =b;
        }

        if (c<min) {
            min = c;
        }
        return min;
    }
}
