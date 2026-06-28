package Arrays;

public class SortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        boolean res = sort(arr, 0);
        System.out.println(res);
    }

    static boolean sort(int[] arr, int index){
        if(index == arr.length -1){
            return true;
        }

        return ( arr[index] < arr[index+1] && sort(arr, ++index));
    }
}
