
class Solution {
    static int[][] visited;
    public boolean exist(char[][] board, String word) {
        boolean result = false;
        visited = new int[board.length][board[0].length];  
        
        if(word.length()==0) return false;
        
        for(int i=0; i<board.length; ++i){
            for(int j=0; j<board[0].length; ++j){
                if(dfs(i, j, board, word, word.length(), 0))
                    return true;
            }
        }
        return result;
    
    }
    
    public boolean dfs(int i, int j, char[][] board, String word, int wordLen, int k){   
            
            if(k==wordLen)
                return true;
            
            if(i<0 || i>=board.length || j<0 || j>=board[0].length || k>=wordLen || board[i][j]!=word.charAt(k) || visited[i][j]==1)
                return false;
        
            visited[i][j] = 1;

            boolean result = dfs(i-1, j, board, word, word.length(), k + 1)||
            dfs(i+1, j, board, word, word.length(), k + 1)||
            dfs(i, j-1, board, word, word.length(), k + 1)||
            dfs(i, j+1, board, word, word.length(), k + 1);

            visited[i][j] = 0;
           
        
        return result;
    }
}
