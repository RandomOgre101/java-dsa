import java.util.Arrays;

public class bubble_sort {
    public static void main(String[] args) {
            int[] arr = {3,4,5,90,87,34,13,87,2,1};
            bubbleSort(arr);
            System.out.println(Arrays.toString(arr));
        }

        static void bubbleSort(int[] arr){
            boolean swapped;
            for (int i = 0; i < arr.length; i++) {
                swapped = false;
                for (int j = 1; j < arr.length-i; j++) {

                    if(arr[j] < arr[j-1]){

                        int temp = arr[j];
                        arr[j] = arr[j-1];
                        arr[j-1] = temp;
                        swapped = true;
                    }
                }
                
                if(!swapped){
                    break;
                }
            }
        }
    }