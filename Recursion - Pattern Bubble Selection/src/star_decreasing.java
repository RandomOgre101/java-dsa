public class star_decreasing {
    public static void main(String[] args) {
        stars(5);
        System.out.println();
        kunalMethod(5,0);
        System.out.println();
    }

    static void stars(int n){
        if(n==0){
            return;
        }
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println();

        stars(n-1);
    }

    static void kunalMethod(int r, int c){
        if (r==0){
            return;
        }

        if (c<r) {
            System.out.print("* ");
            kunalMethod(r,c+1 );
        } else {
            System.out.println();
            kunalMethod(r-1,0);
        }
    }
}
