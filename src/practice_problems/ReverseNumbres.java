package practice_problems;

public class ReverseNumbres {
    public static void main(String[] args) {
        System.out.println(reverse1(1234));
//        reverse1(1234);
//        System.out.println(sum);
    }

    // method 1
//    static int sum = 0;
//    static void reverse1(int n){
//        if(n == 0){
//            return;
//        }
//        int last = n%10;
//        sum = sum*10 + last;
//        reverse1(n/10);
//    }

    static int reverse1(int n){
        int digit = 0;
        return helper(n, digit);
    }

    static int helper(int n, int d){
        if(n==0){
            return d;
        }
        return helper(n/10, (d*10 + n%10));
    }
}
