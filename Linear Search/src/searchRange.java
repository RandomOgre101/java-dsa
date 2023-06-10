public class searchRange {
    public static void main(String[] args) {
        // search for 3 in range index [1,4]
        int[] nums ={23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        int target = 2;
        System.out.println(rangeSearch(nums, target, 1, 4));
    }

    static int rangeSearch(int[] arr, int target, int start, int end){
        if(arr.length==0){
            return -1;
        }

        for (int i = start; i <= end; i++) {
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        return -1;
    }
}
