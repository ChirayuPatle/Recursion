public class OccurencesOfZeros {

    // Method 1
//    static int count = 0;
//    static int occurences(int n){
//        if(n==0){
//            return count;
//        }
//        if(n%10 == 0){
//            count++;
//
//        }
//        return occurences(n/10);
//    }

    // Method 2
    static int occurences2(int n){
        int count = 0;
        return helper(n, count);
    }

    // Special example to return value of tail recursive call to previous recursive calls
    private static int helper(int n, int count) {
        if(n==0){
            return count;
        }
        if(n%10 == 0){
            count++;
        }
        return helper(n/10, count);
    }

    public static void main(String[] args) {
        int n = 10010001;
//        occurences(n);
//        System.out.println(count);

        System.out.println(occurences2(100101));
    }
}
