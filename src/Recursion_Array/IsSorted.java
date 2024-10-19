package Recursion_Array;

public class IsSorted {
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,4,5,1};
        int flag=0;
        System.out.println(isSorted(arr,flag));
    }
    static boolean isSorted(int[] arr,int index){
        if(index== arr.length-1)
            return true;
        return arr[index]<arr[index+1] && isSorted(arr,index+1);


    }

}
/*
In all function call array object is same
different reference variables pointing to the same object.
 */
