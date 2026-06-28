public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sum(1999));
    }

    static int sum(int n){
//        if(n <=0){
//            return 0;
//        }

        if(n%10 == n){
            return n;
        }

        return sum(n/10) + (n%10);
    }
}
