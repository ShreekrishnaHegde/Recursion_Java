package Recursion_Array;

import java.util.ArrayList;

public class SpecialConcept {
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,4,5,5,6};
        System.out.println(search(arr,5,0));
    }

    static ArrayList<Integer> search(int[] arr,int target,int index){
        ArrayList<Integer> list=new ArrayList();
        if(index==arr.length)
            return list;
        if(target==arr[index])
            list.add(index);
        ArrayList<Integer> ansFromBeloeCalls=search(arr,target,index+1);
        list.addAll(ansFromBeloeCalls);
        return list;
    }
}
