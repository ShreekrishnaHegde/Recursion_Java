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
F(N)=n*F(n-1)

 */