class Solution {
    public boolean isIsomorphic(String s, String t) {
        char[] chr1 = s.toCharArray();
        char[] chr2 = t.toCharArray();
        
        if(chr1.length != chr2.length)
            return false;
        else{
        Map<Character, Character> unique_chr = new HashMap<>();
           
        for(int i=0; i<chr1.length; i++)
        {
            if(!unique_chr.containsKey(chr1[i]))
            {
                unique_chr.put(chr1[i], chr2[i]);
            }
            
            else{
                char ch = unique_chr.get(chr1[i]);
                if(ch!=chr2[i])
                    return false;
            }
            
        }
            
            List<Character> al = new ArrayList<>();
            for(char ch : unique_chr.keySet()){
                
                if(!al.contains(unique_chr.get(ch))){
                    al.add(unique_chr.get(ch));
                }
                else
                    return false;
            }    
        
        }
        
        return true;
    }
}
