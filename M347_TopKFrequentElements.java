class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int[] freq = new int[k];
        
        for(int i=0; i<nums.length;i++){
            if(!hm.containsKey(nums[i])){
                hm.put(nums[i],1);
            }
            else{
                hm.put(nums[i], hm.get(nums[i])+1);
            }
        }
        
        Map<Integer, Integer> hm1 = sortByValue(hm); 
        int i = 0;
        // print the sorted hashmap 
        for (Map.Entry<Integer, Integer> en : hm1.entrySet()) { 
            if(k>0){
                freq[i] = en.getKey(); 
                i++;    k--;
            }
        } 
        
        return freq;
    
    }
    
    public static HashMap<Integer, Integer> sortByValue(HashMap<Integer, Integer> hm) 
    { 
        // Create a list from elements of HashMap 
        List<Map.Entry<Integer, Integer> > list = 
               new LinkedList<Map.Entry<Integer, Integer> >(hm.entrySet()); 
  
        // Sort the list 
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() { 
            public int compare(Map.Entry<Integer, Integer> o1,  
                               Map.Entry<Integer, Integer> o2) 
            { 
                return (o2.getValue()).compareTo(o1.getValue()); 
            } 
        }); 
          
        // put data from sorted list to hashmap  
        HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>(); 
        for (Map.Entry<Integer, Integer> aa : list) { 
            temp.put(aa.getKey(), aa.getValue()); 
        } 
        return temp; 
    } 
    
}
