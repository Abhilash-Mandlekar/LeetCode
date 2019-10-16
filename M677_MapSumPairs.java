class MapSum {

    HashMap<String, Integer> hm;
    
    /** Initialize your data structure here. */
    public MapSum() {
         hm = new HashMap<String, Integer>();
    }
    
    public void insert(String key, int val) {
        if(hm.get(key)==null){
            hm.put(key, val);
        }
        else{
            // remove current key and add
            hm.remove(key);
            hm.put(key, val);
        }
    }
    
    public int sum(String prefix) {
        int num=0;
        
        for (Map.Entry<String, Integer> pair : hm.entrySet()) {
            
            String str = pair.getKey();
            if(str.startsWith(prefix)){
                num+=pair.getValue();;
            }
          
        }
        
        return num;
    }
}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */