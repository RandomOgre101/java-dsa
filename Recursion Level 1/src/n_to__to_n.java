public class n_to__to_n {
    public static void main(String[] args) {
        func(5);
    }

    static void func(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        func(n-1);
        System.out.println(n);
    }
}
