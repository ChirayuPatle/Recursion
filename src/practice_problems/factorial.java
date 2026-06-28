package practice_problems;

public class factorial {
    public static void main(String[] args) {
//        int res = fac(5);
//        int res = sum(12345);
//        int res = product(123456);
//        cyclePrint(123456);
//        int res = cycleSum(123456);
//        int res = occurences(110010);
        int res = countDigitOne(13);
//        System.out.println(count);
        System.out.println(res);
    }
    // factorial
//    static int fac(int n){
//        if(n==1){
//            return n;
//        }
//        return n * fac(n-1);
//    }

    // sum of digits
//    static int sum(int n) {
//        if(n/10 == 0){
//            return n;
//        }
//        int rem = n%10;
//        return rem + sum(n/10);
//    }

    // product of digits
//    static int product(int n) {
//        if(n/10 == 0){
//            return n;
//        }
//        int rem = n%10;
//        return rem * product(n/10);
//    }

    // print number in cycle
//    static void cyclePrint(int n){
//        if(n/10 == 0){
//            System.out.println(n);
//            return;
//        }
//        System.out.print(n%10);
//        cyclePrint(n/10);
//    }
    // cycle sum
//    static int cycleSum(int n){
//        if(n/10==0){
//            return n;
//        }
//        return (n%10) + cycleSum(n/10);
//    }

    // occurences of zero
//    static int count = 0;
//    static int occurences(int n){
//        if(n/10==0){
//            return n;
//        }
//        if(n%10 == 0) {
//            count++;
//        }
//        return occurences(n/10);
//    }

    static int occurences(int n){
        int count = 0;
        return helper(n, count);
    }
    static int helper(int n, int c){
        if(n/10==0){
            return c;
        }
        if(n%10 == 0){
            c++;
        }
        return helper(n/10, c);
    }

    // find occurences of 1
    public static int countDigitOne(int n) {
        int count = 0;
        for(int i = 1; i<= n; i++){
            findOccurences(i, count);
        }
        return count;
    }

    static int findOccurences(int n, int count){
        if(n/10 == 0){
            return count;
        }
        if(n%10==1){
            count++;
        }
        return findOccurences(n/10, count);
    }
}
