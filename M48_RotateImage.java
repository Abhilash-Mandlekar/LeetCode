class Solution { 
    public void rotate(int[][] matrix) {
       int n = matrix.length - 1; 
        int j = matrix.length;
        if(j%2!=0) j-=1;
        j/=2; int k=0;
        while(k<j){
       for(int i=k; i<matrix[0].length-1-k; i++){ //[0+k] --- [n-k]
           int temp1 = matrix[0+k][0+i]; // int temp1 = matrix[0][0+i];
           int temp2 = matrix[0+i][n-k]; // int temp2 = matrix[0+i][n];
           
           matrix[0+i][n-k] = temp1; // matrix[0+i][n] = temp1;
           temp1 = temp2;
           temp2 = matrix[n-k][n-i]; // temp2 = matrix[n][n-i];
           
           matrix[n-k][n-i] = temp1; // matrix[n][n-i] = temp1;
           temp1 = temp2;
           temp2 = matrix[n-i][0+k]; // temp2 = matrix[n][0];
           
           matrix[n-i][0+k] = temp1; //matrix[n-i][0] = temp1;
           temp1 = temp2;
           temp2 = matrix[0+k][0+i]; // temp2 = matrix[0][0+i];
           
            matrix[0+k][0+i] = temp1; // matrix[0][0+i] = temp1;
           temp1 = temp2;
           temp2 = matrix[0+i][n-k]; // temp2 = matrix[0+i][n];
           
           
       }
            k++;
    }
}
}
