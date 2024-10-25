package String;

public class SkipString {
    public static void main(String[] args) {
        System.out.println(skipString("asdapple::"));
    }

    static String skipString(String original){
        if(original.isEmpty())
            return "";
        if (original.startsWith("apple"))
            return skipString(original.substring(5));
        else
            return original.charAt(0)+skipString(original.substring(1));
    }
}
