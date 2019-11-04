class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        //String[] str = paragraph.toLowerCase().split(" ");
        //String[] spl_chr = {".","!",",","@","$","%","&"};
        
            if(paragraph.contains("."))
                paragraph = paragraph.replace(".","");
            if(paragraph.contains(","))
                paragraph = paragraph.replace(","," ");
            if(paragraph.contains("!"))
                paragraph = paragraph.replace("!","");
            if(paragraph.contains("?"))
                paragraph = paragraph.replace("?","");
            if(paragraph.contains("'"))
                paragraph = paragraph.replace("'","");
            if(paragraph.contains(";"))
                paragraph = paragraph.replace(";","");
        
        
        String[] str = paragraph.toLowerCase().trim().replaceAll(" +", " ").split(" ");
        
        List<String> para = new ArrayList<String>(Arrays.asList(str));
        List<String> ban = new ArrayList<String>(Arrays.asList(banned));
        Map<String, Integer> mp = new HashMap<String, Integer>();
        
        para.removeAll(ban);
        
        
            for(String stp: para){
                //System.out.println(stp);
            
                if(!mp.containsKey(stp)){
                mp.put(stp, 0);
                }
                else{
                    int key = mp.get(stp);
                    key++;
                    mp.put(stp, key);
                }
            
        
        
        }
        System.out.println(mp);
        Map.Entry<String, Integer> maxEntry = null;

    for (Map.Entry<String, Integer> entry : mp.entrySet())
    {
        if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0)
        {
            maxEntry = entry;
        }
    }
        //System.out.println(maxEntry);
        
        return(maxEntry.getKey());
    }
}