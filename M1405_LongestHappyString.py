class Solution:
    def longestDiverseString(self, a: int, b: int, c: int) -> str:
        result= []
        a_flag, b_flag, c_flag = False, False, False
        
        while a>0 or b>0 or c>0:            
            if c>=a and c>=b and c>=2 and not c_flag:
                result.append('c')
                result.append('c')
                a_flag, b_flag, c_flag = False, False, True
                c-=2
            elif b>=a and b>=c and b>=2 and not b_flag:
                result.append('b')
                result.append('b')
                a_flag, b_flag, c_flag = False, True , False
                b-=2
            elif a>=b and a>=c and a>=2 and not a_flag:
                result.append('a')
                result.append('a')
                a_flag, b_flag, c_flag = True, False , False
                a-=2
            elif c>0 and not c_flag:
                result.append('c')
                a_flag, b_flag, c_flag = False, False, True
                c-=1
            elif b>0 and not b_flag:
                result.append('b')
                a_flag, b_flag, c_flag = False, True , False
                b-=1
            elif a>0 and not a_flag:
                result.append('a')
                a_flag, b_flag, c_flag = True, False , False
                a-=1
            else:
                break
            
        if not result:
            return ""
        
        return ''.join(result)
                
