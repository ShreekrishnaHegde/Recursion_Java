public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(search(arr,40,0,arr.length-1));
    }

    static int search(int[] arr,int target,int s,int e){
        if (s>e)
            return -1;
        int m=s+(e-s)/2;
        if (arr[m]==target)
            return m;
        if (target<arr[m])
            search(arr,target,s,m-1);
        return search(arr,target,m+1,e);
        }

}


/*
->Linear Recurrence relation(Fibonacci numbers)
    Fib(N)=Fib(N-1)+Fib(N-2)
->Divide and cConquer recurrence relation(Binary Search)
    F(N)=O(1)+F(N/2)
->Tail recursive function.
 */
