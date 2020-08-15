class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String[] str = s.split(" ");
        
        String result = "";
        for(int i=str.length-1; i>=0; i--)
        {
            //System.out.println("str " + str[i]);
            if (str[i].equals(""))
                continue;
            if(i==0)
                result += str[i].trim() + "";
            else
                result += str[i].trim() + " ";
        }
        
        return result;
    }
}
