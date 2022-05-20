class Solution:
    def longestIncreasingPath(self, matrix: List[List[int]]) -> int:
        rows = len(matrix)
        cols = len(matrix[0])
        result = float('-inf')
        dp = [[0]*cols for j in range(rows)]
        
        def findLongest(i, j, matrix, dp):
            nonlocal rows, cols
            if i<0 or j<0 or i>=rows or j>=cols:
                return
            if dp[i][j]!=0:
                return dp[i][j] 
            
            for m, n in [(-1, 0), (1, 0), (0, 1), (0, -1)]:
                x = i+m
                y = j+n
                if x<0 or y>=cols or x>=rows or y<0 :
                    continue
                    
                if matrix[x][y] > matrix[i][j]:
                    #print("x, y", x, y)
                    dp[i][j] = max(dp[i][j], findLongest(x,y, matrix, dp))
            #print(dp)
            dp[i][j]+=1  
            #print(dp)
            return dp[i][j]
        
        for i in range(rows):
            for j in range(cols):
                #print(i, j)
                result = max(result, findLongest(i, j, matrix, dp))
                #print(i, j, findLongest(i, j, matrix, 0, set()))
                
                
        return result
