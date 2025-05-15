package Recursion_Array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        System.out.println(Arrays.toString(mergeSort(arr)));
        mergerSort(0,arr.length-1,arr);
        System.out.println(Arrays.toString(arr));
    }
    static void mergerSort(int low,int high,int arr[]){
        if(low>=high)
            return;
        int mid=low+(high-low)/2;
        mergerSort(low,mid,arr);
        mergerSort(mid+1,high,arr);
        merge(low,mid,high,arr);
    }
    static void merge(int low,int mid,int high,int[] arr){
        int left=low;
        int right=mid+1;
        ArrayList<Integer> list=new ArrayList<>();
        while(left<=mid && right<=high){
             if(arr[left]<=arr[right]){
                 list.add(arr[left++]);
             }
             else{
                 list.add(arr[right++]);
             }
        }
        while(left<=mid){
            list.add(arr[left++]);
        }
        while(right<=high){
            list.add(arr[right++]);
        }
        for(int i=low;i<=high;i++){
            arr[i]=list.get(i-low);
        }
    }
    static int[] mergeSort(int[] arr){
        if(arr.length==1)
            return arr;
        int mid= arr.length/2;
        int[] left=mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right=mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }
    private static int[] merge(int[] first,int[] second){
        int[] mix=new int[first.length+second.length];
        int i=0,j=0,k=0;
        while (i< first.length && j< second.length){
            if(first[i]<second[j]) {
                mix[k] = first[i];
                i++;
            }
            else{
                mix[k]=second[j];
                j++;
            }
            k++;
        }
        while(i< first.length){
            mix[k]=first[i];
            i++;
            k++;
        }
        while(j< second.length){
            mix[k]=second[i];
            j++;
            k++;
        }
        return mix;
    }
}
/*
->At every level n elements are being merged.
->Time complexity: O(N*log(N))
->Space Complexity: O(N)
->Recusrive Relatiob: T(N)=T(N/2)+T(N/2)+N-1
 */