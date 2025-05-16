package BackTracking;

public class Queen {

    public static void main(String[] args) {
        int n=4;
        boolean[][] board=new boolean[n][n];
        queen(board,0);
    }
    static int queen(boolean[][] board,int row){
        if(row==board.length) {
            display(board);
            System.out.println();
            return 1;
        }//placing the queen and checking every row and column.
        int count=0;
        for (int col=0;col< board.length;col++){
            //place the queen if it is safe.
            if(isSafe(board,row,col)) {
                board[row][col] = true;
                count+=queen(board,row+1);
                board[row][col]=false;
            }
        }
        return count;

    }
    private static boolean isSafe(boolean[][] board,int row,int col){
        //Check for vertical row
        for (int i = 0; i < row; i++) {
            if(board[i][col])
                return false;
        }
        //diagonal left
        int maxLeft=Math.min(row,col);
        for (int i=1;i<=maxLeft;i++){
            if (board[row-i][col-i])
                return false;
        }

        int maxRight=Math.min(row, board.length -col-1);
        for (int i=1;i<=maxRight;i++){
            if (board[row-i][col+i])
                return false;
        }
        return true;

    }

    private static void display(boolean[][] board){
        for(boolean[] row: board){
            for (boolean element: row){
                System.out.print(element?"Q ":"X ");
            }
            System.out.println();
        }
    }
}

/*
T(N)= N*T(N-1) +O(n^2)
do this with only recursion

Rules:
1)Every row should a queen
2)Every Col Should have a queen
3)none of the queens should attack each other
Queen can attack in all 8 direction
 */