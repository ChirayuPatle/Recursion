package Arrays;
import java.util.ArrayList;

public class ArrayListExample {
    // Q. Find occurrences
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,6,6,7,8}; // output: [5,6,7]
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> ans = findIndex(arr, 6, 0, list);
        System.out.println(ans);
        System.out.println(list);
    }

    static ArrayList<Integer> findIndex(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index == arr.length-1){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return findIndex(arr, target, index+1, list);
    }
}
