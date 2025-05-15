package Basics;

/*
Program to print the sum of first n integers from 1 to n.
 */
public class SumOfNnumbers {
    public static void main(String[] args) {
        int n=5;
        int[] result={0};
        sum(n,0);
        System.out.println(sum(n));
    }

    //functional Way
    static int sum(int n){
        if(n==1)
            return 1;
        return n+sum(n-1);
    }
    //Parameterized way
    static void sum(int n,int result){
        if(n<1){
            System.out.println(result);
            return;
        }
        sum(n-1,result+n);
    }

}
/*
->Non-tail recursive function.
->Base Condition: n=1
->F(n)=n+F(n-1) is the Recursive Relation
 */
