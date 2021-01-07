
// Modular and easy to read code for Tic-Tac-Toe

// Challenge is to check right to left diagonal as same or not


class TicTacToe {

    /** Initialize your data structure here. */
    
    int grid[][];
    
    public TicTacToe(int n) {
        grid = new int[n][n];
    }
    
    /** Player {player} makes a move at ({row}, {col}).
        @param row The row of the board.
        @param col The column of the board.
        @param player The player, can be either 1 or 2.
        @return The current winning condition, can be either:
                0: No one wins.
                1: Player 1 wins.
                2: Player 2 wins. */
    public int move(int row, int col, int player) {
        grid[row][col] = player; int m = grid.length-1; int n = grid[0].length-1;
        return (checkWin(grid, row, col, player, m, n))? player: 0;
    }
    
    public boolean checkWin(int[][]grid, int row, int col, int player, int m, int n){
        return (checkRow(grid, row, col, player, m, n)|| checkCol(grid, row, col, player, m, n) || checkDiag(grid, row, col, player, m, n));
    }
    
    public boolean checkRow(int[][]grid, int row, int col, int player, int m, int n){
        for(int j=0; j<n; ++j){
            if(grid[row][j]==0 || grid[row][j+1]!=player || grid[row][j]!=grid[row][j+1])
                return false;
        }
        return true;
    }
    public boolean checkCol(int[][]grid, int row, int col, int player, int m, int n){
        for(int i=0; i<m; ++i){
            if(grid[i][col]==0 || grid[i+1][col]!=player || grid[i][col]!=grid[i+1][col])
                return false;
        }
        return true;
    }
    
    public boolean checkDiag(int[][]grid, int row, int col, int player, int m, int n){
        // check 2 diagonals -- right to left and left to right
        return (checkDiagLeftToRight(grid, row, col, player, m, n) || checkDiagRightToLeft(grid, row, col, player, m, n));
    }
    
    public boolean checkDiagLeftToRight(int[][]grid, int row, int col, int player, int m, int n){
        //diagonal left to right
        for(int i=0; i<m; ++i){
            
            if(grid[i][i]==0 || grid[i+1][i+1]!=player || grid[i][i]!=grid[i+1][i+1])
                return false;
            
        }
        return true;
    }
    
    public boolean checkDiagRightToLeft(int[][]grid, int row, int col, int player, int m, int n){
        int i=0;
        //diagonal right to left
        for(int j=n; j>0 && i<n; --j){
           
            if(grid[i][j]==0 || grid[i+1][j-1]!=player || grid[i][j]!=grid[i+1][j-1])
                return false;
            ++i;
        }
        return true;
    }
}

/**
 * Your TicTacToe object will be instantiated and called as such:
 * TicTacToe obj = new TicTacToe(n);
 * int param_1 = obj.move(row,col,player);
 */
