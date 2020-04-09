class Solution {
    public boolean backspaceCompare(String S, String T) {
        
        List<Character> process_s = new ArrayList<>();
        List<Character> process_t = new ArrayList<>();
        
        for(int i=0; i<S.length(); i++){
            if(process_s.size()==0 && S.charAt(i)=='#')
                ;
            else{
                if(S.charAt(i)!='#')
                    process_s.add(S.charAt(i));
                if(S.charAt(i)=='#')
                    process_s.remove(process_s.size() - 1);
            }
        }
        
        for(int i=0; i<T.length(); i++){
            if(process_t.size()==0 && T.charAt(i)=='#')
                ;
            else{
                if(T.charAt(i)!='#')
                    process_t.add(T.charAt(i));
                if(T.charAt(i)=='#')
                    process_t.remove(process_t.size() - 1);
            }
        }
        
        //System.out.println(process_s);
        //System.out.println(process_t);

        if(process_s.equals(process_t))
            return true;
        else
            return false;
    }
}

