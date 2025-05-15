package Subsets;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class SubSequenceSum {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        sum(0,0,new ArrayList<>(),3,arr);
        System.out.println();
        sum2(0,0,new ArrayList<>(),3,arr);
        System.out.println(sum3(0,0,3,arr));

    }
    public static void sum(int index,int sum,ArrayList<Integer> list,int K,int[] arr){
        if(index>=arr.length){
            if(sum<=K){
                System.out.print(list+"\t\t");
            }
            return;
        }
        list.add(arr[index]);
        sum+=arr[index];
        sum(index+1,sum,list,K,arr);
        list.removeLast();
        sum-=arr[index];
        sum(index+1,sum,list,K,arr);
    }

    public static boolean sum2(int index, int sum, ArrayList<Integer> list,int K,int[] arr){
        if(index>=arr.length){
            if(sum<=K){
                System.out.print(list+"\t\t");
                return true;
            }
            else{
                return false;
            }
        }
        list.add(arr[index]);
        sum+=arr[index];
        if(sum2(index+1,sum,list,K,arr))
            return true;
        list.removeLast();
        sum-=arr[index];
        if(sum2(index+1,sum,list,K,arr))
            return true;
        return false;
    }
    public static int  sum3(int index, int sum,int K,int[] arr){
        if(index>=arr.length) {
            if (sum <= K) {
                return 1;
            } else {
                return 0;
            }
        }
        sum+=arr[index];
        int l=sum3(index+1,sum,K,arr);
        sum-=arr[index];
        int r=sum3(index+1,sum,K,arr);
        return l+r;
    }

}
