package PatternPrinting;

import javax.swing.plaf.IconUIResource;

public class Pattern1 {
    public static void main(String[] args) {
        Triangle(4,0);
    }
    static void Triangle(int r,int c){
        if(r==0)
            return;
        else if(c<r){
            System.out.print("*");
            Triangle(r,c+1);
        }
        else{
            System.out.println();
            Triangle(r-1,0);
        }
    }
}
