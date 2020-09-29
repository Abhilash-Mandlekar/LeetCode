class Solution {
    
    public int lengthOfLongestSubstring(String s) {
        
        int result=0; int longestDupFreeIdx=0;
        Map<Character, Integer> hm = new HashMap<>();
        
        char[] ch = s.toCharArray();
        
        if(s.length()==0) return result;
        
        for(int i=0; i<ch.length; ++i){
            // returns previous value of key and then updates the map
            Integer num = hm.put(ch[i], i);
            if(num!=null){
                if(num>=longestDupFreeIdx){
                result = Math.max(result, i - longestDupFreeIdx);
                longestDupFreeIdx = num + 1;
                }
            }
        }
        
        return Math.max(result, ch.length - longestDupFreeIdx);
    }
}
