public class one_to_n {
    public static void main(String[] args) {
        toN(10);
    }

    static void toN(int n){
        if(n == 0){
            return;
        }
        toN(n-1);
        System.out.println(n);
    }
}
