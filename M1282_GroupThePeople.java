class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        
        int[] arr = new int[groupSizes.length];
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        List<Integer> al = new ArrayList<Integer>();
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        
        for(int i=0; i<groupSizes.length; i++)
        {
            arr[i] = i;
        }
        
        for(int i=0; i<groupSizes.length; i++)
        {
            hm.put(arr[i], groupSizes[i]);
        }
        
        for(int i=0; i<groupSizes.length; i++)
        {
            if(!al.contains(groupSizes[i]))
                al.add(groupSizes[i]);                
            
        }
        //System.out.println(al);
        for(int i=0; i<al.size(); i++)
        {
            List<Integer> li = new ArrayList<Integer>();
            for(Map.Entry<Integer, Integer> entry : hm.entrySet())
            {
                int n = entry.getValue();
                if (n==al.get(i)){
                    if(li.size()>=n){
                        result.add(li);
                        li.clear();
                    }
                    li.add(entry.getKey());
                }
            }
            result.add(li);
        }
        
        //System.out.println(hm);
        return result;
    }
}
