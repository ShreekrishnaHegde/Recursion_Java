public class Basics {
    public static void main(String[] args) {
    rec(1);
    }
    //Simple recursion to print numbers from 1 to 5.
    //A function that called itself is called recursiom.
    static void rec(int n){
        if(n==5){
            System.out.println(5);
            return;
        }
        System.out.println(n);
        //This is called tail recursion since this is the last function call.
        rec(n+1);
    }
}
/*
->Space complexity is not constant.
->You can convert recursion into iteration and vice versa.
->Recursion tree.
 */

/*
->Breaking the problem
->Write the recurrence relation if needed.
->Draw the recursive tree.
->About the tree
->See the flow of functions.
 */