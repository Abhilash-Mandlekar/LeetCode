
// Sliding window approach
class Solution {
    public int shortestDistance(String[] wordsDict, String word1, String word2) {
        int wordsToCover = 2;
        int left=0, right=0, result = Integer.MAX_VALUE;
        Map<String, Integer> hm = new HashMap<>();
        hm.put(word1, 1);
        hm.put(word2, 1);
        
        while(right<wordsDict.length)
        {
            if(hm.get(wordsDict[right])!=null && hm.put(wordsDict[right], hm.getOrDefault(wordsDict[right],0)-1)>=1)      
                wordsToCover--;
            
                        
            while(wordsToCover==0 ){
                result = Math.min(result, (right - left));
                if(hm.get(wordsDict[left])!=null && hm.put(wordsDict[left], hm.getOrDefault(wordsDict[left],0)+1)>=0)
                    wordsToCover++;
                    
                ++left;
            }
            
            ++right;
        }
        
        return result;
    }
}
