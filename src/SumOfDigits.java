/*
Program to print the sum of digits and product of the digits  of a given number.
 */
public class SumOfDigits {
    //Sum of the digits of a number.
    public static void main(String[] args) {
        System.out.println(sum(2134));
    }
    static int sum(int n){
        if(n==0)
            return 0;
        return n%10+sum(n/10);
    }
    static int product(int n){
        if(n%10==n)
            return n;
        return n%10*product(n/10);
    }
}
/*
->Non-tail recursive function
->Base Condition: n%10=n and n=0
->Recursive Relation:F(n)=F(N/10)+N%10 and F(n)=F(N/10)*(N%10)
 */