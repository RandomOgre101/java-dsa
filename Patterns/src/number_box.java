import java.util.*;

public class number_box {
    public static void main(String[] args) {
        pattern(4);
    }

    static void pattern(int n){
        int originalN = n;
        n = 2*n;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                int atIndex = Math.max(Math.max(i,j), Math.max(n-i, n-j)) - originalN;
                System.out.print(atIndex + " ");
            }
            System.out.println();
        }
    }
}
