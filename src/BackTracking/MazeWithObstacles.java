package BackTracking;
/*
Maze with obstacles
When you land on a new cell check whether it is river or not.
if you land on river stop the recursion call
this is not backtracking
This is stopping the recursion at some point.

 */
public class MazeWithObstacles {
    public static void main(String[] args) {
        boolean board[][]={
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        pathObstacle("",board,0,0);
    }
    static void pathObstacle(String p,boolean[][] maze,int r,int c){
        if (r== maze.length-1 && c==maze[0].length- 1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c])
            return;
        if (r< maze.length-1){
            pathObstacle(p+'D',maze,r+1,c);
        }
        if(c< maze[0].length){
            pathObstacle(p+'R',maze,r,c+1);
        }


    }
}
