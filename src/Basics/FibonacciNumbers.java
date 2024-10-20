package Basics;

/*
Program to print Fib numbers using recursion.
 */
public class FibonacciNumbers {
    /*
    finding nth fib number using recursion.
     */
    public static void main(String[] args) {
        System.out.println(fib(7));
    }

    static int fib(int n){
        //Base Condition
        if(n<2)
            return n;
        //This is not last function call, hence not tail recursion.
        //*f(n-1) is going to execute first.
        return fib(n-1)+fib(n-2);
    }
}
/*
-> Fib(N)=Fib(N-1)+Fib(N-2)+O(1) is known as recurrence relation.
->Base condition: F(0)=0, F(1)=1.
->n if n == 0, n == 1;
    fib(n) = fib(n-1) + fib(n-2) otherwise;
->Non-tail recursive function.
 */