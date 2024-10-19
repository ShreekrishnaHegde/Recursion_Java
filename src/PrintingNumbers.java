public class PrintingNumbers {
    //given n=5, return all the integers starting fom 5 till 1.
    public static void main(String[] args) {
        display1(5);
    }
    static void display1(int n){
        if(n==0)
            return;
        System.out.println(n);
        display1(n-1);
    }

    static void display2(int n){
        if(n==0)
            return;
        display2(n-1);
        System.out.println(n);
    }



}
