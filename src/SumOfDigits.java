public class SumOfDigits {
    //Sum of the digits of a number.
    public static void main(String[] args) {
        System.out.println(dig(2134));
    }
    static int dig(int n){
        if(n==0)
            return 0;
        return n%10+dig(n/10);
    }
    static int product(int n){
        if(n%10==n)
            return n;
        return n%10*product(n/10);
    }
}
//F(n)=F(N/10)+N%10