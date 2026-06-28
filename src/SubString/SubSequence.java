package SubString;

public class SubSequence {
    public static void main(String[] args) {
        sequence("", "abc");
    }

    static void sequence(String p, String up){
        if(up.isEmpty()){
            System.out.print("'"+  p + "' ");
            return;
        }
        char ch = up.charAt(0);
        // add it
        sequence(ch + p, up.substring(1));
        // ignore it
        sequence(p, up.substring(1));
    }
}
