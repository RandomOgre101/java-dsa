public class single_in_array {
    public static void main(String[] args) {
        // xor all the numbers
        int[] arr = {2,3,4,2,6,4,3};
        System.out.println(singular(arr));
    }

    static int singular(int[] arr) {
        int unique = 0;
        for(int i: arr){
            unique ^= i;
        }
        return unique;
    }
}
