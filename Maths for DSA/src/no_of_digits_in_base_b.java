public class no_of_digits_in_base_b {
    public static void main(String[] args) {
        int n = 160;
        int ans = 0;
        int b = 2;

//        while(n>0){
//            ans++;
//            n = n>>1;
//        }
//        System.out.println(ans);

        ans = (int) (Math.log(n)/Math.log(b)) + 1;
        System.out.println(ans);
    }
}
