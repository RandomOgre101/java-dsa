
/*
Given an array of integers arr, the task is to find the minimum and maximum element of that array using recursion.

Examples :

Input: arr = {1, 4, 3, -5, -4, 8, 6};
Output: min = -5, max = 8
 */

public class min_and_max {
    public static void main(String[] args) {
        int[] arr = {-1,2,4,-3,0,8,4,9};
        System.out.println(max(arr,arr.length));
        System.out.println(min(arr,arr.length));
    }

    static int max(int[] arr, int index){
        if (index == 1){
            return arr[0];
        }

        return Math.max(arr[index-1], max(arr, index-1));
    }

    static int min(int[] arr, int index){
        if (index == 1){
            return arr[0];
        }

        return Math.min(arr[index-1], min(arr, index-1));
    }
}
