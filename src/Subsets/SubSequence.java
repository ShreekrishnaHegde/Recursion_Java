package Subsets;

import java.util.ArrayList;
import java.util.Arrays;

public class SubSequence {
    public static void main(String[] args) {

        System.out.println(subseq02("","abc"));
        int[] arr={1,2,3};
        subseq03(0,new ArrayList<>(),arr);
    }
    static void subseq01(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        subseq01(p+ch,up.substring(1));
        subseq01(p,up.substring(1));


    }
    static ArrayList<String> subseq02(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;

        }
        char ch=up.charAt(0);
        ArrayList<String> left=subseq02(p+ch,up.substring(1));
        ArrayList<String> right=subseq02(p,up.substring(1));
        left.addAll(right);
        return left;
    }
    static void subseq03(int index,ArrayList<Integer> list,int[] arr){
        if(index>= arr.length){
             System.out.print(list+"\t\t");
            return;
        }
        list.add(arr[index]);
        subseq03(index+1,list,arr);
        list.removeLast();
        subseq03(index+1,list,arr);
    }

}

/*

Contiguous and non-contiguous part of the arrat is called subsequence at the same time it should foloow the order of the array
Power set
 */
