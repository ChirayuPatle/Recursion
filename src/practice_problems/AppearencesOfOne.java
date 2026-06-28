package practice_problems;

public class AppearencesOfOne {

    public static void main(String[] args) {
        int res = findOccurences(10, 0);
        System.out.println(res);
    }
    public static int findOccurences(int n, int count){
        if(n/10 == 0){
            return count;
        }
        if(n%10 == 1){
            count++;
        }
        if(n/10 == 1){
            count++;
        }

        return findOccurences(n/10, count);
    }

//    static int findOccurences(int n, int count){
//        if(n==1){
//            count++;
//        }
//        if(n/10 == 0){
//            return count;
//        }
//        if(n%10==1){
//            count++;
//        }
//        return findOccurences(n/10, count);
//    }
}

