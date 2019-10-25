class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int temp=0; boolean val = false;
        if(matrix.length==0 || matrix[0].length==0)
            return false;
        else{
            for(int i=0; i<matrix.length; i++)
            {
                
                if((matrix[i][0]<= target && target<=matrix[i][matrix[0].length-1])
                   || (matrix[i][0]==target))
                {
                      //System.out.println(matrix[i][0] + "--- " + matrix[i][matrix[0].length-1]);
                    temp = i;
                }
            }
            
            if(matrix[0].length==1){
                for(int j=0; j<matrix[0].length; j++){
                    //System.out.println(matrix[temp][j]);
                    if(target==matrix[temp][j])
                        return true;
                }
            }
            else{
            for(int j=0; j<matrix[0].length; j++){
                //System.out.println(matrix[temp][j]);
                if(target==matrix[temp][j])
                    return true;
            }
            }
        }
        return val;
    }
}