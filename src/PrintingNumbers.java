/*
Programs to print Numbers from 1 to n and n to 1.
 */
public class PrintingNumbers {
    public static void main(String[] args) {
        display1(5);
    }
    //Function to display number from n to 1.
    static void display1(int n){
        if(n==0)
            return;
        System.out.println(n);
        display1(n-1);
    }
    //Function to display number from 1 to n.
    static void display2(int n){
        if(n==0)
            return;
        display2(n-1);
        System.out.println(n);
    }
}
/*
->Base Condition: n=0
------display1--------
->Print n
->Call the recursive function by passing n-1 as argument.
------display2--------
->Call the recursive function by passing n-1 as argument.
->Print n.
 */
