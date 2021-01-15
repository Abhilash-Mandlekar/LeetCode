
//Expand around center approach O(n^2)

class Solution {
    public String longestPalindrome(String s) {
        int m = 0;
        String result = "";
        for(int i=0; i<s.length(); ++i){
            // Odd length string
            String str1 = expandFromMiddle(i, i, s);
            // Even length string
            String str2 = expandFromMiddle(i, i+1, s);
            
            if(m<Math.max(str1.length(), str2.length())){
                if(str1.length()<str2.length()){
                    m = str2.length(); result = str2;
                } 
                else{
                    m = str1.length(); result = str1;
                }
            }
            
        }
        
        return result;
    }
    
    public String expandFromMiddle(int left, int right, String s){
        
        String res = s.charAt(left)+"";
        
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            --left; ++right;
        }
                    
        res = s.substring(left+1, right);
        
        return res;
    }
}
