package practice_problems;

public class PatternPrinting {
    public static void main(String[] args) {
        pattern(4);
    }

    static void pattern(int n){
        if(n == 0){
            return;
        }

        for(int i = 1; i <= n; i++){
            System.out.print("* ");
        }
        System.out.println();

        pattern(n-1);
    }
}
