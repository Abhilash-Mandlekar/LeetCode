class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        List<Character> open_chars = new ArrayList<>();
        List<Character> closing = new ArrayList<>();
        open_chars.add('('); open_chars.add('{'); open_chars.add('[');
        
        /*if(s.startsWith(")") || s.startsWith("]") || s.startsWith("}"))
            return false;*/
        
        for(int i=0; i<s.length(); i++)
        {
            if(open_chars.contains(s.charAt(i)))
                st.push(s.charAt(i));
            else{
                if(st.empty())
                    return false;
                else if(s.charAt(i)==')' && st.peek()=='(')
                    st.pop();
                else if(s.charAt(i)==']' && st.peek()=='[')
                    st.pop();
                else if(s.charAt(i)=='}' && st.peek()=='{')
                    st.pop();
                else
                    closing.add(s.charAt(i));
            }
        }
        
        if(st.empty() && closing.isEmpty())
            return true;
        else
            return false;
    }
}