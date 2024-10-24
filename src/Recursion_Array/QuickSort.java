package Recursion_Array;

import java.util.ArrayList;
import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        Arrays.sort(arr);
        quick(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void quick(int[] nums,int l,int h){
        if(l>=h)
            return;
        int start=l;
        int end=h;
        int m=start+(end-start)/2;
        int pivot=nums[m];
        while (start<=end){
            //also a reason if the array is sorted it ll not swap.
            while(nums[start]<pivot)
                start++;
            while (nums[end]>pivot)
                end--;
            if(start<=end){
                int temp=nums[start];
                nums[start]=nums[end];
                nums[end]=temp;
                start++;
                end--;
            }
        }
        quick(nums,l,end);
        quick(nums,start,h);

    }
}
/*
choose any element as pivot
after first pass, all the elements less than pivot will be on left side of pivot
and elements on greater than pivot will be on right side of the pivot.
->After every pass you are putting pivot at the current position.
->How to pick pivet element
Complexity:
T(N)=T(K)+T(N-K-1)+O(N)
When one part of array is empty then it is worst case.
T(N)=T(n-1)+O(N)
Complexity:O(N2)
Best case
Complexity:T(N/2)+T(N/2)+O(N)
O(NlogN)

->Not stable
->In place sorting algorithm
->Merge sort is better in linked list.
->Hybrid sorting algorithms
    Merge sort and insertion sort

->Dual pivot
 */
