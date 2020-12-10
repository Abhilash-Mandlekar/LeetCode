class Coordinate{
    public int x;
    public int y;
    
    public Coordinate(int x, int y){
        this.x = x;
        this.y = y;
    }
}

class Solution {
    
    int dirs[][] = {{1,0}, {-1,0}, {0,1}, {0,-1}, {-1,-1}, {1,1}, {-1,1}, {1,-1}};
    
    public char[][] updateBoard(char[][] board, int[] click) {
        
        int i = click[0]; int j= click[1];
        if(board[i][j]=='M'){
            board[i][j] = 'X';
            return board;
        }
    
        int[][] visited = new int[board.length][board[0].length];
        //bfs algorithm
        bfs(i, j, board, visited);
                    
        return board;
    }

    public void bfs (int i, int j, char[][] board, int[][] visited){

            Queue<Coordinate> q = new LinkedList<>();
            q.add(new Coordinate(i,j));

            while(!q.isEmpty()){
                Coordinate curr = q.poll();
                i = curr.x; j= curr.y;

                if(board[i][j]=='M')
                    board[i][j] = 'X';

                else{

                countAdjecentMine(i,j, board);

                if(!Character.isDigit(board[i][j])){
                    board[i][j] = 'B';
                    for(int[] dir: dirs){

                    int r = i + dir[0]; int c =j+dir[1];
                    if(r>=0 && c>=0 && r<board.length && c<board[0].length && board[r][c]=='E'){                
                            q.add(new Coordinate(r,c));
                            board[r][c] = 'B';
                        }
                    }
                }

            }

        }
    }
    
    
    public void countAdjecentMine(int m, int n, char[][] board){ 
        int count=0; 
        for(int[] dir: dirs){
            int i= m + dir[0]; int j= n + dir[1];
            
                if(i>=0 && j>=0 && i<board.length && j<board[0].length && (board[i][j]=='M' || board[i][j]=='X'))
                    count++;  
            }
        
        if(count==0)
            board[m][n] = 'B';
        else
            board[m][n] = (char) (count + '0'); 
        
    }
}
