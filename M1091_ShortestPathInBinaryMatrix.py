class Solution:
    def shortestPathBinaryMatrix(self, grid: List[List[int]]) -> int:
        if not grid or grid[0][0]==1 or grid[-1][-1]==1:
            return -1
        
        q = deque([])
        q.append([0, 0, 1])
        visited = set()
        visited.add((0, 0))
        dirs = [(-1, 0), (-1, -1), (-1, 1), (1, 0), (1, -1), (1, 1), (0, -1), (0, 1)]
        
        while q:
            x, y, d = q.popleft()
            
            if x==len(grid)-1 and y ==len(grid[0])-1:
                return d
            
            #Explore the neighbours
            for m, n in dirs:
                i, j = x + m, y + n
                if i<0 or i>=len(grid) or j<0 or j>=len(grid[0]) or (i, j) in visited or grid[i][j]==1:
                    continue
               
                visited.add((i, j))
                q.append([i, j, d+1])
        
        
        return -1
