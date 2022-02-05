class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        res = []
        intervals.sort(key=lambda x: x[0])
        res.append(list(intervals[0]))
        
        i=1
        while i<len(intervals):
            # Get last from res
            n = res[-1]
            if n[0]<=intervals[i][0] and intervals[i][0]<= n[1]:
                n[1] = max(n[1], intervals[i][1])
            else:
                res.append(list(intervals[i]))
            i+=1
            
        return res
        
