package practice_problems;

public class NumbersSum {
    public static void main(String[] args) {
//        System.out.println(sum1(12245));
        System.out.println(sum2(100045));
    }

    // Method 1
//    static int sum = 0;
//    private static int sum1(int n) {
//        if(n%10 == 0){
//            return sum;
//        }
//        sum = sum + (n%10);
//        return sum1(n/10);
//    }

    // method 2 - using helper function
    public static int sum2(int n){
        return helper(n,0);
    }

    static int helper(int n, int s){
        if(n==0){
            return s;
        }
        s += n%10;
        return helper(n/10, s);
    }

}
