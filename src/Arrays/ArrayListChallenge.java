package Arrays;

import java.util.ArrayList;

// Very high space complexity: O(n)

public class ArrayListChallenge {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5,5,6,7,8};
        ArrayList<Integer> list =  new ArrayList<>();
        ArrayList<Integer> ans = findOccurrences(arr, 5, 0);
        System.out.println(ans);
    }

    public static ArrayList<Integer> findOccurrences(int[] arr, int target, int index){
        // for every function call it will create new object
        ArrayList<Integer> list = new ArrayList<>();
        if(target == arr[index]){
            list.add(index);
        }
        if(index == arr.length -1){
            return list;
        }

        // return the answer
        // this call gets element from returned list
        ArrayList<Integer> newList = findOccurrences(arr, target, ++index);
        // now this line will be executed after stack is been cleared
        list.addAll(newList);

        return list;
    }
}
