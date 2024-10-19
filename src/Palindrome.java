public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palindrome(1));
    }
    static int sum=0;
    static boolean palindrome(int n){
        return (n==reverse2(n));
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
