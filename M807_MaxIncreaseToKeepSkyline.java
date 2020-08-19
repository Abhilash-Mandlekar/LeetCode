class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        
        List<Integer> rowMax = new ArrayList<Integer>();
        List<Integer> colMax = new ArrayList<Integer>();
        int sum = 0;
        
        for(int i=0; i<grid.length; i++){
            int max = -1;
            for(int j=0; j<grid[0].length; j++){
                max = Math.max(grid[i][j], max);
            }
            rowMax.add(max);
        }
        
        for(int j=0; j<grid[0].length; j++){
            int max = -1;
            for(int i=0; i<grid.length; i++){
                max = Math.max(grid[i][j], max);
            }
            colMax.add(max);
        }
        
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                sum+= Math.min(rowMax.get(j), colMax.get(i)) - grid[i][j];
            }
        }
        return sum;
    }
}
