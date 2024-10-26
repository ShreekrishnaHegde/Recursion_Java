package Permutations;

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
        System.out.println(diceCount("",4));
        System.out.println(diceList("",4));
        dice("",4);

    }
    static void dice(String p,int target){
        if (target==0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <=6 && i<=target; i++) {
            dice(p+i,target-i);
        }
    }

    static ArrayList<String> diceList(String p, int target){
        if (target==0){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list=new ArrayList<>();
        for (int i = 1; i <=6 && i<=target; i++) {
            list.addAll(diceList(p+i,target-i));
        }
        return list;
    }
    static int diceCount(String p,int target){
        if (target==0)
            return 1;
        int count=0;
        for (int i = 1; i <=6 && i<=target; i++) {
            count+=diceCount(p+i,target-i);
        }
        return count;
    }

}
