public class power_of_2 {
    public static void main(String[] args) {
        int n = 18;

        if((n & (n-1)) == 0){
            System.out.println("Power of 2");
        }
        else{
            System.out.println("Not a power of 2");
        }
    }
}
