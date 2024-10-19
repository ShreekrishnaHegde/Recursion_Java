public class ReverseNumber {
    public static void main(String[] args) {
        int n=12345;
        reverse(n);
        System.out.println(sum);
    }
    static int sum=0;
    static void reverse(int n){
        if(n==0)
            return;
        sum=sum*10+n%10;
        reverse(n/10);
    }


}
