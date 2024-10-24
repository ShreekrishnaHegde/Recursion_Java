package String;
/*
Question: Given a string, create another string which has no 'a' s in it.
ex: baccab
ans:bccb

 */
public class RemoveA {
    public static void main(String[] args) {
        String str="abbacc";
        skip01("",str);
        System.out.println(skip02(str));
    }

    static void skip01(String processed,String original){
        if(original.isEmpty()) {
            System.out.println(processed);
            return;
        }
        char ch=original.charAt(0);
        if(ch == 'a'){
            skip01(processed,original.substring(1));
        }
        else
            skip01(processed+ch,original.substring(1));
    }
    static String skip02(String original){
        if(original.isEmpty()) {
            return "";
        }
        char ch=original.charAt(0);
        if(ch == 'a'){
            return skip02(original.substring(1));
        }
        else
            return ch+skip02(original.substring(1));
    }


}
