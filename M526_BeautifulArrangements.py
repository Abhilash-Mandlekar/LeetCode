class Solution:
    def countArrangement(self, n: int) -> int:
        count = 0
        s = set()
        
        def dfsPerm(N, pos):
            nonlocal count
            nonlocal s
            
            if pos > N:
                count+=1
            for i in range(1, N+1):
                if i not in s and (pos % i == 0 or i % pos == 0):
                    
                    s.add(i)
                    dfsPerm(N, pos+1)
                    s.remove(i)
                
        
        
        dfsPerm(n,1)
        
        return count
