/*
Program to print the sum of first n integers from 1 to n.
 */
public class SumOfNnumbers {
    public static void main(String[] args) {
            int n=5;
        System.out.println(sum(n));
    }

    static int sum(int n){
        if(n==1)
            return 1;
        return n+sum(n-1);
    }
}
/*
->Non-tail recursive function.
->Base Condition: n=1
->F(n)=n+F(n-1) is the Recursive Relation
 */
