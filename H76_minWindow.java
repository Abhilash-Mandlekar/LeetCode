class Solution {
  
  
    // ---------- SLIDING WINDOW APPROACH-----------------------
    
    public String minWindow(String s, String t) {
        
        if(s == null || s.length() < t.length() || s.length() == 0)  return "";
        
        Map<Character, Integer> chCount = new HashMap<>();
        int wordsToCover = t.length();
        int left_result = -1, right_result = -1;
        
        for(int i=0; i<t.length(); ++i){
            chCount.put(t.charAt(i), chCount.getOrDefault(t.charAt(i), 0) +1);
        }
        //System.out.println(chCount);
        
        int left=0, right = 0;
        
        // This approach is sliding window
        while(right<s.length()){
            
            if(chCount.containsKey(s.charAt(right)) && chCount.put(s.charAt(right), chCount.get(s.charAt(right)) -1) >=1)
                wordsToCover--;
            
            // keep incrementing left pointer till all the characters are covered 
            while(wordsToCover==0){
                if((left_result==-1 && right_result==-1) || (right_result - left_result)>(right - left)){
                    right_result = right;
                    left_result = left;
                }
                     
                
                if(chCount.containsKey(s.charAt(left)) && chCount.put(s.charAt(left), chCount.get(s.charAt(left)) +1) >=0)
                    wordsToCover++;
                
                left++;
            }
            
            right++;
        }
        return (left_result==-1 && right_result==-1)? "" : s.substring(left_result, right_result+1);
      
      
      // Time complexity is O(S + T) or O(N)
    }
}
