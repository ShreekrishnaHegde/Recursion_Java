package Subsets;

import java.util.ArrayList;
import java.util.Collections;

/*

Output should be displayed in increasing order of sums
 */
public class SubsetSum {
    public static void main(String[] args) {

    }
    public static ArrayList<Integer> subsetSums(ArrayList<Integer> arr,int N){
        ArrayList<Integer> sumSubset=new ArrayList<>();
        fun(0,0,arr,N,sumSubset);
        Collections.sort(sumSubset);

    }
    static void fun(int index,int sum,ArrayList<Integer> arr,int N,ArrayList<Integer> subSet){
        if(index==N){
            subSet.add(sum);
            return;
        }
        fun(index+1,sum+arr.get(index),arr,N,subSet);
        fun(index+1,sum,arr,N,subSet);
    }
}
