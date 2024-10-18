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
->Recursion is function calling itself.
->The process in which a function calls itself directly or indirectly is called recursion
    and the corresponding function is called a recursive function.
---------------Memory Allocation---------------
->When any function is called from main(), the memory is allocated to it on the stack.
    A recursive function calls itself, the memory for a called function is allocated on top of memory allocated
    to the calling function and a different copy of local variables is created for each function call.
    When the base case is reached, the function returns its value to the function by whom it is called
    and memory is de-allocated and the process continues.
->Recursion problems can be solved using iteration and vice versa.
->Every function call will take some memory in stack memory.
->When there is no base condition in the recursive function, when the memory exceeds the limit,it will give
    stack overflow error.
->Space complexity is not constant.
->You can convert recursion into iteration and vice versa.
->Recursion tree.
->Types of recurrence relation
->Working of function calls
->Internal Working of recursion.
->Base Condition
->Recursion Tree
->Direct and Indirect recursion
-Tail and non-tail Recursive
->A recursive function is tail recursive when a recursive call is the last thing executed by the function.

 */



/*
-------------Steps for solving the problem--------------
->Breaking the problem
->Write the recurrence relation if needed.
->Draw the recursive tree.
->About the tree
->See the flow of functions.
 */