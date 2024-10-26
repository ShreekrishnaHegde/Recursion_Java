package Recursion_Array;

public class Substring {
    public static void main(String[] args) {
        String str= "krishna";
        substring(str,0);


    }
    static void substring(String str,int start){
        if(start==str.length())
            return ;
        for(int end=start+1;end<=str.length();end++){
            String subString=str.substring(start,end);
            System.out.print(subString+" ");
        }
        substring(str,start+1);
    }
}
