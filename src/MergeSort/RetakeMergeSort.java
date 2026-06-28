package MergeSort;

import java.util.Arrays;

public class RetakeMergeSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int[] sortedArr = mergeSort(arr);
        System.out.println(Arrays.toString(sortedArr));
    }

    private static int[] mergeSort(int[] arr) {
        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid) );
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return mergeElements(left, right);
    }

    private static int[] mergeElements(int[] left, int[] right) {
        int[] newArr = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;

        // comparing elements of array and sorting them
        while (i<left.length && j<right.length){
            if(left[i]<right[j]){
                newArr[k] = left[i];
                i++;
            }else{
                newArr[k] = right[j];
                j++;
            }
            k++;
        }

        // leftover elements
        while (i<left.length){
            newArr[k] = left[i];
            i++;
            k++;
        }
        while (j<right.length){
            newArr[k] = right[j];
            j++;
            k++;
        }

        return newArr;
    }

}
