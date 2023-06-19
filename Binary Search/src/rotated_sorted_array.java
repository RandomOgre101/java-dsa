public class rotated_sorted_array {
    public static void main(String[] args) {

        int[] nums = {4,5,6,7,0,1,2};
        int target = 5;
        int peak = peakSearch(nums);
        int ans = binarySearch(nums, target, 0, peak);
        if(ans != -1){
            System.out.println(ans);
        }
        System.out.println(binarySearch(nums, target, peak+1, nums.length-1));
    }

    static int peakSearch(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }

            if(mid > start && arr[mid]<arr[mid-1]){
                return mid-1;
            }

            if(arr[mid] <= arr[start]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }


    static int binarySearch(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end-start)/2;
            if(target > arr[mid]){
                start = mid+1;
            }
            else if(target < arr[mid]){
                end = mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
