import java.util.ArrayList;

public class PrintNumbers {
    public static void main(String[] args) {
//        System.out.println(findNumber(5));
        int n = 5;
        PrintInCycle(n);
        ArrayList<Integer> arr = new ArrayList<>(n*2);
        for(int i = 0; i < n*2; i++){
            arr.add(i);
        }
        System.out.println();
        int res = returnSum(arr);
        System.out.println("Sum of Numbers: "+res);
    }

//    static int findNumber(int n){
//        // Base condition
//        if(n==1){
//            return 1;
//        }
//        System.out.println(n);
//        // Recursive call
//        return findNumber(n-1);
//    }

    public static void PrintInCycle(int n){
        if(n==0){
            return;
        }
        System.out.print(n + " ");
        PrintInCycle(n-1);
        System.out.print(n + " ");
    }

    public static int returnSum(ArrayList<Integer> arr){
        int sum = 0;
        for(int n : arr){
            sum += n;
        }
        return sum;
    }
}
