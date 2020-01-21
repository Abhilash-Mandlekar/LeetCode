class Solution { 
    public void rotate(int[][] matrix) {
       int n = matrix.length - 1; 
        int j = matrix.length;
        if(j%2!=0) j-=1;
        j/=2; int k=0;
        while(k<j){
       for(int i=k; i<matrix[0].length-1-k; i++){ //[0+k] --- [n-k]
           int temp1 = matrix[0+k][0+i]; 
           int temp2 = matrix[0+i][n-k]; 
           
           matrix[0+i][n-k] = temp1; 
           temp1 = temp2;
           temp2 = matrix[n-k][n-i];
           
           matrix[n-k][n-i] = temp1; 
           temp1 = temp2;
           temp2 = matrix[n-i][0+k]; 
           
           matrix[n-i][0+k] = temp1; 
           temp1 = temp2;
           temp2 = matrix[0+k][0+i]; 
           
            matrix[0+k][0+i] = temp1; 
           temp1 = temp2;
           temp2 = matrix[0+i][n-k]; 
           
           
       }
            k++;
    }
}
}
