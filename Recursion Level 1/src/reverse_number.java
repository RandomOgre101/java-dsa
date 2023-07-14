public class reverse_number {
    public static void main(String[] args) {
        System.out.println(rev(1342));
        rev1(1342);
        System.out.println(sum);
    }

    static int rev(int n) {
        if(n<10){
            return n;
        }

        return (int) ((n%10) * Math.pow(10,(int)Math.log10(n)) + rev(n/10));
    }

    static int sum = 0;
    static void rev1(int n){
        if (n == 0) {
            return;
        }
        int rem = n%10;
        sum = sum*10 + rem;
        rev1(n/10);
    }
}
