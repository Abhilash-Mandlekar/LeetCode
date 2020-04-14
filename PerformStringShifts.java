/*
Test case 1:
Input: s = "abc", shift = [[0,1],[1,2]]
Output: "cab"
Explanation: 
[0,1] means shift to left by 1. "abc" -> "bca"
[1,2] means shift to right by 2. "bca" -> "cab"

Test case 2:
Input: s = "abcdefg", shift = [[1,1],[1,1],[0,2],[1,3]]
Output: "efgabcd"
Explanation:  
[1,1] means shift to right by 1. "abcdefg" -> "gabcdef"
[1,1] means shift to right by 1. "gabcdef" -> "fgabcde"
[0,2] means shift to left by 2. "fgabcde" -> "abcdefg"
[1,3] means shift to right by 3. "abcdefg" -> "efgabcd"

Optimized way is to: 
You may notice that left shift cancels the right shift, so count the total left shift times 
(may be negative if the final result is right shift), and perform it once.

*/
class Solution {
    public String stringShift(String s, int[][] shift) {
        String str = ""; String n_str = ""; int k=0;
        for(int i=0; i<shift.length; i++)
        {        
            str = ""; n_str = "";
            
            if(shift[i][0]==0){
                k=shift[i][1]; int j=0;
                for(j=0; j<k; j++){
                    str+=s.charAt(j);
                }
                while(j<s.length()){
                    n_str+=s.charAt(j); j++;
                }
                s = n_str + str;
                System.out.println(" left " + s);
            } 
            else{
                k=shift[i][1]; int j=0; 
                for(j=s.length()-k; j<s.length(); j++){
                    str+=s.charAt(j);
                }
                
                for(j=0; j<s.length()-k; j++){
                    n_str+=s.charAt(j);
                }
                    
                
                s = str + n_str;
                System.out.println("right "+s);
            }
            
            }
        
        
        return s;
    }
}
