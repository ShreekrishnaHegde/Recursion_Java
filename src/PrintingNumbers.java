public class PrintingNumbers {
    //given n=5, return all the integers starting fom 5 till 1.
    public static void main(String[] args) {
        display(5);
    }
    static void display(int n){
        if(n==0)
            return;
        System.out.println(n);
        display(n-1);
    }

}
