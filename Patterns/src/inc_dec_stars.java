public class inc_dec_stars {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n){
        for (int i = 1; i < 2*n; i++) {
            int c = i>n ? 2*n-i : i;
            for (int col = 0; col < c; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
