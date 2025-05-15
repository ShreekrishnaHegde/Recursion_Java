package Recursion_Array;

import java.util.Arrays;

public class ReveringArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        reverse(0,arr);
        System.out.println(Arrays.toString(arr));
    }
    //Using two pointers and recursion
    static void reverse(int n,int[] arr){
        if(n>=arr.length/2)
            return;
        int temp=arr[n];
        arr[n]=arr[arr.length-1-n];
        arr[arr.length-1-n]=temp;
        reverse(n+1,arr);
    }
}
