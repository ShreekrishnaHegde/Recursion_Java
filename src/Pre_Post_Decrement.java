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