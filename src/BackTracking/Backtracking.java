package BackTracking;

public class Backtracking {
    public static void main(String[] args) {
        boolean board[][]={
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        allPath("",board,0,0);
    }
    static void allPath(String p,boolean[][] maze,int r,int c){
        if (r== maze.length-1 && c==maze[0].length- 1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c])
            return;
        maze[r][c]=false;
        if (r< maze.length-1){
            allPath(p+'D',maze,r+1,c);
        }
        if(c< maze[0].length){
            allPath(p+'R',maze,r,c+1);
        }
        if (r>0)
            allPath(p+'U',maze,r-1,c);
        if (c>0)
            allPath(p+'L',maze,r,c-1);
        //This  line is where the function will be over, beofre the function gets removes lalos remove the chages that were
        //removes by function.
        //Make a change and reverse a change

        maze[r][c]=true;

    }
}
