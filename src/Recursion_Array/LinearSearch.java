package Recursion_Array;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr=new int[]{1,3,5,6};
        System.out.println(search1(arr,6,0));
        System.out.println(search2(arr,6,0));

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
}
