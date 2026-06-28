package practice_problems;

public class CheckSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        boolean res = findSorted(arr,0);
        System.out.println(res);
    }
    static boolean findSorted(int[] arr, int index){
        if(index == arr.length-1){
            return true;
        }
        if(arr[index] > arr[index+1]){
            return false;
        }
        return findSorted(arr, index+1);
    }
}
