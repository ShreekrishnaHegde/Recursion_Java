/*
program to find the factorial of a given number using recursion.
 */
public class Factorial {
    public static void main(String[] args) {
        //finding factorial of a number.
        System.out.println(fac(5));

    }
    static int fac(int n){
        if(n==0)
            return 1;
        return n*fac(n-1);
    }
}
/*
-> F(N)=n*F(n-1)
->Non tail recursive function
->Base Condition: n=0
->F(N)= n*F(N-1)
 */