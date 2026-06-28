package practice_problems;

public class ProductOfDigits {
//    public static int count = 1;

    public static void main(String[] args) {
        int n = 12534;
        int res  = product(n);
        System.out.println(res);
//        System.out.println(count);
    }

    // method 1
//    static int product(int n){
//        if(n==0){
//            return count;
//        }
//        count *= n%10;
//        return product(n/10);
//    }

    // using helper function
    public static int product(int n){
        int mul = 1;
        return helper(n, mul);
    }

    static int helper(int n, int k){
        if(n == 0){
            return k;
        }

        k = k *(n%10);
        return helper(n/10, k);
    }
}
