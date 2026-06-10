public class Palindrome {
    public static int reverse(int n){
        int digits = (int) (Math.log10(n)) +1;
        return helper(n, digits);
    }

    private static int helper(int n, int digit) {
        if(n%10 == 0){
            return n;
        }

        int rem = n % 10;
        return (rem * (int) Math.pow(10, digit-1))+helper(n/10, digit -1);
    }

//    static boolean isPal(int n){
//        return n == rev(n);
//    }

    public static void main(String[] args) {
        int n = 1446441;

//        System.out.println(isPal(n));

        int res = reverse(n);
        if(n==res){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");
        }
    }
}
