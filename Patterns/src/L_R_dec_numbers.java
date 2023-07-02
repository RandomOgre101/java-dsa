public class L_R_dec_numbers {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n){
        for (int i = 1; i <= n; i++) {
            for (int s = 0; s < n-i; s++) {
                System.out.print("  ");
            }

            for (int j = i; j >= 1 ; j--) {
                System.out.print(j+" ");
            }
            for (int j = 2; j <= i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
