package Permutations;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
//        permutations("","abc");
        System.out.println(permutationsList("","abcde"));
        System.out.println(permutationsCount("","abcde"));
    }
    static void permutations(String p,String up){
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        for (int i = 0; i <=p.length(); i++) {
            String f=p.substring(0,i);
            String s=p.substring(i);
            permutations(f+ch+s,up.substring(1));
        }

    }
    static int permutationsCount(String p,String up){
        if(up.isEmpty()) {
            System.out.println(p);
            return 1;
        }
        int count=0;
        char ch=up.charAt(0);
        for (int i = 0; i <=p.length(); i++) {
            String f=p.substring(0,i);
            String s=p.substring(i);
            count+=permutationsCount(f+ch+s,up.substring(1));
        }
        return count;

    }

    static ArrayList<String> permutationsList(String p, String up){
        if(up.isEmpty()) {
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> ans=new ArrayList<>();
        for (int i = 0; i <=p.length(); i++) {
            String f=p.substring(0,i);
            String s=p.substring(i);
            ans.addAll(permutationsList(f+ch+s,up.substring(1)));
        }
        return ans;

    }
}
