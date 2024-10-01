public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        display(1);
    }

    static void display(int n){
        if(n<=5){
            System.out.println(n);
            n++;
            display(n);
        }
    }

}
/*

 */