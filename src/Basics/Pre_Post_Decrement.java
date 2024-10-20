package Basics;

/*
Program to show the concept of pre- and post-increment in recursion calls.
 */
public class Pre_Post_Decrement {
    public static void main(String[] args) {
        display1(5);
    }
    static void display1(int n){
        if(n==0)
            return;
        System.out.println(n);
        display1(--n);
    }

    static void diplay2(int n){
        if(n==0)
            return;
        System.out.println(n);
        diplay2(n--);
    }

}
/*
->display1 will be called indefinite number of times. Hence, we will get an error.
    Because each time the value of n is decremented after ot is passed into the function
    Hence the value of n passed in 1st pass is same as value of n passed in nth pass.
    Hence even though we decremented n, the value of n will never decrement. Hence, it will not touch the
    base condition.Hence, the function will be called indefinite times.
-> n-- : first the value of n is passed then it will get decremented.
-> --n : first the value of n is decremented then the decremented value will be passed.
 */