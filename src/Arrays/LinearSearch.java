package Arrays;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,5};
        int res = search(arr, 4, 0);
        System.out.println(res);
        // find all occurrences
        findAllIndex(arr, 4, 0);
        System.out.println(list);
    }

    static int search(int[] arr, int target, int index){
        if(arr[index] == target){
            return index;
        }
        if(index == arr.length -1){
            return -1;
        }
        return (search(arr, target, ++index));
    }

    static ArrayList<Integer> list = new ArrayList<>();

    static void findAllIndex(int[] arr, int target, int index){
        if(arr[index] == target){
            list.add(index);
        }
        if(index == arr.length -1){
            return;
        }
        findAllIndex(arr, target, ++index);
    }

}
