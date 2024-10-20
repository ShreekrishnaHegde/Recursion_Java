package Basics;

/*
->Program to reverse a given number and print it.
 */
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
        //Given the total number of digits in a number
        int digits=(int)(Math.log10(n))+1;
        return flag(n,digits);
    }
    static int flag(int n,int digits){
        if(n%10==n)
            return n;
        return (n%10)*(int)(Math.pow(10,digits-1))+flag(n/10,digits-1);
    }
}
/*
NOTE:int digits=(int)(Math.log10(n))+1; gives total number of digits in a number.
---------reverse1----------
->Tail Recursive Function
->Base Condition: n=0
->Recursive Relation: F(N)=F(N/10)

--------reverse2-----------
Base Condition: n%10=n
->Recursive Relation:
->Non tail recursive function
 */