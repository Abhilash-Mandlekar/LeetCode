class Solution {
    public void reverseWords(char[] s) {
        
        revString(s, 0, s.length-1);
        //System.out.println(new String(s));
        
        int i=0, j=0;
        while(i<=j && j<s.length){
            while(j<s.length && s[j]!=' ' )
                ++j;
            
            //System.out.println("i: " + i + "j: " + j);
            revString(s, i, j-1);
            
            //System.out.println(new String(s));
            
            while(i<s.length && s[i]!=' ')
                ++i;
                

            while(i<s.length && j<s.length && s[j]==' ' && s[i] == ' ')
            {
                ++i; ++j;
            }
        
        }
    }
    
    public void revString(char[] ch, int i, int j){
        
        while(i<j){
            char c = ch[i];
            ch[i] = ch[j];
            ch[j] = c;
            ++i;
            --j;
        }    
        
    }
    
}
