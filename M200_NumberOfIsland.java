class Coordinate{
    public int x;
    public int y;
    
    public Coordinate(int x, int y){
        this.x = x;
        this.y = y;
    }
}

class Solution {
        
    public int numIslands(char[][] grid) {
        if(grid.length==0)  return 0;
        int[][] visited = new int[grid.length][grid[0].length]; 
        int count =0;
        
        for(int i=0; i<grid.length; ++i){
            for(int j=0; j<grid[0].length; ++j){
                if(grid[i][j]=='1' && visited[i][j]==0){                    
                    bfs(i, j, grid, visited);
                    count++;
                }
            }
        }
        
        return count;
    }
    
    public void bfs(int i, int j, char[][] grid, int[][] visited){
        
        Queue<Coordinate> q = new LinkedList<>();
        q.add(new Coordinate(i,j));
        //System.out.println(" x " + q.peek().x + " y " + q.peek().y);
        //System.out.println(" grid length x " + grid.length + " grid length y " + grid[0].length);
        
        while(!q.isEmpty()){
            
            Coordinate curr = q.poll();
            
            if(curr.x>=0 && curr.x<grid.length && curr.y >=0 && curr.y< grid[curr.x].length  && grid[curr.x][curr.y]=='1' && visited[curr.x][curr.y]!=1){
                
                visited[curr.x][curr.y] = 1;
               
                q.add(new Coordinate(curr.x-1, curr.y));
                q.add(new Coordinate(curr.x+1, curr.y));
                q.add(new Coordinate(curr.x, curr.y-1));
                q.add(new Coordinate(curr.x, curr.y+1));
                
            }
            
        }
    }
}

