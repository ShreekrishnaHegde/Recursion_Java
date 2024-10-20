package Recursion_Array;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        ArrayList<Integer> list2=new ArrayList<>();
        int[] arr=new int[]{1,3,5,5,5,6};
        System.out.println(search1(arr,6,0));
        System.out.println(search2(arr,6,0));
        GetAllIndices(arr,5,0);
        System.out.println(list);
        System.out.println(GetAllIndices2(arr,5,0,list2));

    }
    static boolean search1(int[] arr,int target,int index){
        if(index== arr.length)
            return false;
        return arr[index]==target || search1(arr,target,index+1);

    }
    static int search2(int[] arr,int target,int index){
        if(index== arr.length)
            return -1;
        if(target==arr[index])
            return index;
        return search2(arr,target,index+1);
    }

    static ArrayList<Integer> list=new ArrayList<>();
    static void GetAllIndices(int[] arr,int target,int index){
        if(index== arr.length)
            return;
        if(target==arr[index])
            list.add(index);
        GetAllIndices(arr,target,index+1);
    }

    static ArrayList GetAllIndices2(int[] arr,int target,int index,ArrayList<Integer> list){
        if (index== arr.length)
            return list;
        if(target==arr[index])
            list.add(index);
        return GetAllIndices2(arr,target,index+1,list);
    }

}
/*
->Reference variables may change, but the object remains same.
 */