public class ReverseNumber {

    // method 1 - but results in space complexity
//    static int sum = 0;
//    static void reverse1(int n){
//        // base condition
//        if(n == 0 ){
//            return;
//        }
//        sum = sum*10 + (n%10);
//        reverse1(n/10);
//    }

    // Method 2 - using helper function
    static int reverse2(int n){
        // we will call a helper function
        // take length of number
        int digits = (int) (Math.log10(n)) + 1;
        return helper(n, digits);
    }

    static int helper(int n, int digit){
        if(n%10 == 0){
            return n;
        }
        int rem = n%10;
        return (rem * (int) Math.pow(10, digit-1)) + helper(n/10, digit -1);
    }


    public static void main(String[] args) {
        int n = 1234;
        // method 1
//        reverse1(n);
//        System.out.println(sum);

        // method 2
        System.out.println(reverse2(n));
    }
}
