public class sum_of_digits {
    public static void main(String[] args) {
        System.out.println(sumDigits(1598));
    }

    static int sumDigits(int n) {
        if(n<10){
            return n;
        }
        return n%10 + sumDigits(n/10);
    }
}
