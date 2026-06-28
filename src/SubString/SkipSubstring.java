package SubString;

public class SkipSubstring {
    public static void main(String[] args) {
        String str = "an apple a day keeps doctor away";
        System.out.println(skip(str));
    }
      static String skip(String str){
        if(str.isEmpty()){
            return "";
        }
        if(str.startsWith("apple")){
            return skip(str.substring(5));
        }else{
            return str.charAt(0) +skip(str.substring(1));
        }
      }
}
