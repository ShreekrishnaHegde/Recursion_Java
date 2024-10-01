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
-> Fib(N)=Fib(N-1)+Fib(N-2) is known as recurrence relation.
->Base condition: F(0)=0, F(1)=1.
 */