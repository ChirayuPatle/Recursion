package MergeSort;

import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        int[] arr = {1,3,6,23,68,9};
        int[] ans = sort(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] sort(int[] arr){
        // base condition
        if(arr.length == 1){
            return arr;
        }

        // recursive calls
        // divide array(return type - arr) -> merge the single element arrays
        int mid = arr.length / 2;
        int[] left = sort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = sort(Arrays.copyOfRange(arr, mid, arr.length));

        // merger the returned arrays
        return merge(left, right);
    }

    private static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        // it may be possible that one of the arrays is not complete
        // copy the remaining elements
        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;
    }
}
