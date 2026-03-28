public class NumberExampleUsingRecursion {
    public static void main(String[] args) {
        // using recursion
        number(1);
    }
    static void number(int n){
        // base condition
        if(n > 5){
            return;
        }

        System.out.println(n);
        number(n + 1);
    }
}
