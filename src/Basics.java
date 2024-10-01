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
        rec(n+1);
    }
}
