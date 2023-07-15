public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3,2,1,18,9};
        System.out.println(linear(arr,18,0));
        System.out.println(linear1(arr,18,0));
    }

    static int linear(int[] arr, int target, int index){
        if (index == arr.length){
            return -1;
        }

        if(arr[index] != target){
            return linear(arr,target,index+1);
        }

        return index;
    }

    static boolean linear1(int[] arr, int target, int index){
        if(index == arr.length){
            return false;
        }

        return arr[index] == target || linear1(arr,target,index+1);
    }
}
