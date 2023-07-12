public class ith_magic_number {
    public static void main(String[] args) {
        int n = 3;
        int ans = 0;
        int pow = 1;
        while(n>0){
            int last = n&1;
            n = n>>1;
            ans += last * (Math.pow(5,pow));
            pow++;
        }
        System.out.println(ans);

    }

}
