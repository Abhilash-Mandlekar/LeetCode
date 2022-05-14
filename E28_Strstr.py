class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        if not needle:
            return 0
        
        if len(needle) > len(haystack):
            return -1
        
        left, i, j = -1, 0, 0
        
        for i, ch in enumerate(haystack):
            k=0
            j = i
            while j<len(haystack) and k<len(needle) and haystack[j] == needle[k]:
                k+=1 
                j+=1
            if k == len(needle):
                return i
            
        return left
