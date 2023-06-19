public class CeilingOfaNumber {
    public static void main(String[] args) {

        // find ceiling of a target number; ceiling -> smallest element in array greater/ equal to target element
        // ceiling(arr, 14) = 14   |   ceiling(arr, 15) = 16

        /* 1. figure out target
           2. find greater than or equal to target
           3. find smallest in all of those
         */
        int[] arr = {2,3,4,7,12,14,16,18};
        int target = 8;
        int ans = binaryCeil(arr, target);
        System.out.println(ans);
    }

    static int binaryCeil(int[] arr, int target){

        if(target > arr[arr.length-1]){
            return -1;
        }

        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target < arr[mid]){
                end = mid-1;
            }
            else if(target > arr[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }

        }
        return start;
    }
}
