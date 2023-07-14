public class prod_of_digits {
    public static void main(String[] args) {
        System.out.println(prod(605));
    }

    static int prod(int n){
        if(n<10){
            return n;
        }

        return (n%10) * prod(n/10);
    }
}
