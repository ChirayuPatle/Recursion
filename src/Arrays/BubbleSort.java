package Arrays;

import org.w3c.dom.ls.LSOutput;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,9,8,6};
        sort(arr, 0);
        System.out.println(arr);
    }

    static void sort(int[] arr, int index){
        if(index == 0){
            return;
        }
        if(index > index+1){
            swap(arr, index, index+1);
            sort(arr, index+1);
        }else{
            sort(arr, index+1);
        }
    }

    static void swap(int[] arr, int f, int s){
        int t = arr[f];
        arr[f] = arr[s];
        arr[s] = t;
    }
}
