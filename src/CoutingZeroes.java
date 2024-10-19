/*
Counting number of zeroes in a number
 */
public class CoutingZeroes {
    public static void main(String[] args) {
        int n=12300;
        System.out.println(count(n));
    }
    static int count=0;
    static int count(int n){
        if(n%10==0)
            count++;
        if(n/10==0)
            return count;
        return count(n/10);
    }



}
