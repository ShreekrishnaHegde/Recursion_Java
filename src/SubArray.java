public class SubArray {
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,4};
        displaySubArray(arr);
    }
    static void displaySubArray(int[] arr){
        int n=arr.length;
        //starting index
        for(int i=0;i<n;i++){
        //Ending index
            for(int j=i;j<n;j++){
                for (int k=i;k<=j;k++)
                    System.out.print(arr[k]+" ");
                System.out.println("");
            }
        }
    }
}
