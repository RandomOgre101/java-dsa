import java.util.ArrayList;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int[][] arr = {
                {0,1,1},
                {1,0,1},
                {0,0,0}
        };



        for(int row=0;row<arr.length;row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.println(arr[row][col]);
            }
        }
    }
}