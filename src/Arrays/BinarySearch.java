package Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int res = search(arr, 4, 0, arr.length-1);
        System.out.println(res);
    }

    private static int search(int[] arr, int target, int s, int e) {
        // Method body variable
        int m = s + (e-s)/2;
        // Base condition
        if(s>e){
            return -1;
        }
        // check for target
        if(arr[m] == target){
            return m;
        }
        // move pointers
        // considering the array is in ascending order
        if(target < arr[m]){
            // e  = m-1
            return search(arr, target, s, m-1);
        }else{
            return search(arr, target, m+1, e);
        }
    }
}
