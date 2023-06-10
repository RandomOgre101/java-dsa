import java.util.Arrays;

public class minimumNumber {
    public static void main(String[] args) {
        int[] arr ={23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        System.out.println(min(arr));
    }

    static int min(int[] arr){
        Arrays.sort(arr);
        return arr[0];
    }
}
