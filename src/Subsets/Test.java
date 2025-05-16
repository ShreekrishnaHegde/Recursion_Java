package Subsets;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        int[] deadline = {2, 1, 2, 1, 1};
        int[] profit = {100, 19, 27, 25, 15};
        ArrayList<int[]> jobs = new ArrayList<>();
        for (int i = 0; i < deadline.length; i++) {
            jobs.add(new int[]{profit[i], deadline[i]});
        }
        jobs.sort((a, b) -> Integer.compare(b[0], a[0]));
        System.out.println(function(0,jobs,1));
    }
    static int function(int index,ArrayList<int[]> jobs,int day){
        if(index==jobs.size()-1){
            if(day<=jobs.get(index)[1])
                return jobs.get(index)[0];
            return 0;
        }
        int take=0;
        if(day<=jobs.get(index)[1]){
            take=jobs.get(index)[0]+function(index+1,jobs,day+1);
        }
        int notTake=function(index+1,jobs,day);
        return Math.max(take, notTake);
    }
}
