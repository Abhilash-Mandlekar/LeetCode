class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        HashMap<String, List<String>> hm = new HashMap<>();
       
        //al.add(strs[0]);
        //result.add(al);
        for(int i=0; i<strs.length; i++){
            String str = strs[i]; List<String> al = new ArrayList<>(); 
            char[] chr = str.toCharArray();
            Arrays.sort(chr);//isIchanged = true;
            String rel_str = String.valueOf(chr);
            al.add(str);
           if(!hm.containsKey(rel_str))
               hm.put(rel_str, al);
            else{
                List<String> temp = hm.get(rel_str);
                temp.add(str);
                hm.put(rel_str,temp);
            }
        }
        //System.out.println(hm);
        
        for(String key: hm.keySet())
        {
            List<String> val = hm.get(key);
            result.add(val);
        }
        return result;
    }
}
