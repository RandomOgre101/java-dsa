import java.lang.reflect.Array;
import java.util.ArrayList;

public class LinearSearch_MultipleOccurrences {
    public static void main(String[] args) {
        int[] arr = {1,4,2,2,6,8,2,9};
        ArrayList<Integer> list1 = new ArrayList<>();

        findAllIndex(arr,2,0); System.out.println(list);

        System.out.println(findAllIndex2(arr,2,0,list1));

        System.out.println(findAllIndex3(arr,2,0));
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int index){
        if (index == arr.length){
            return;
        }

        if (arr[index] == target) {
            list.add(index);
        }

        findAllIndex(arr, target,index+1);
    }

    static ArrayList findAllIndex2(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }

        if (arr[index] == target){
            list.add(index);
        }

        return findAllIndex2(arr,target,index+1,list);
    }

    static ArrayList findAllIndex3(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();

        if(index == arr.length){
            return list;
        }

        if (arr[index] == target){
            list.add(index);
        }

        ArrayList<Integer> ansFromBelowCalls = findAllIndex3(arr,target,index+1);
        list.addAll(ansFromBelowCalls);

        return list;
    }



}
