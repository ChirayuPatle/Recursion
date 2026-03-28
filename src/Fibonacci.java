public class Fibonacci {
    public static void main(String[] args) {
        int res = fibo(4);
        System.out.println(res);
    }
    static int fibo(int n){
        // base condition
        if(n < 2){
            System.out.println("this is zero");
            return n;
        }
        int a = n-1;
        int b = n-2;
        return a+b; 
    }
}
