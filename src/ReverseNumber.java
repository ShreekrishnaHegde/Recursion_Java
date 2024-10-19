public class ReverseNumber {
    public static void main(String[] args) {
        int n=12345;
        System.out.println(reverse2(n));
    }
    static int sum=0;
    static void reverse1(int n){
        if(n==0)
            return;
        sum=sum*10+n%10;
        reverse1(n/10);
    }

    static int reverse2(int n){
        int digits=(int)(Math.log10(n))+1;
        return flag(n,digits);
    }
    static int flag(int n,int digits){
        if(n%10==n)
            return n;
        return (n%10)*(int)(Math.pow(10,digits-1))+flag(n/10,digits-1);
    }
}
