public class NumberExample {
    public static void main(String[] args) {
        // study function call/ call stack : print numbers form 1 to 5.
        number1(1);
    }
    static void number1(int n){
        System.out.println(n);
        number2(2);
    }

    static void number2(int n) {
        System.out.println(n);
        number3(3);
    }

    static void number3(int n) {
        System.out.println(n);
        number4(4);
    }

    static void number4(int n) {
        System.out.println(n);
        number5(5);
    }

    static void number5(int n) {
        System.out.println(n);
    }

}