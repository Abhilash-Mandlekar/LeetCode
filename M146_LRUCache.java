class LRUCache {
    
    LinkedHashMap<Integer, Integer> lrCache;
    int capacity;
    int key; int value;
    
    public LRUCache(int capacity) { 
       this.capacity = capacity; 
       this.lrCache = new LinkedHashMap<Integer, Integer>(capacity, 1.0f,true){
           protected boolean removeEldestEntry(Map.Entry<Integer, Integer> e){
               return this.size() > capacity;
           }
       };
    
    }
    
    public LRUCache(int key, int value){
        this.key = key;
        this.value = value;     
    }
    
    public int get(int key) {
        return lrCache.getOrDefault(key, -1);
    }
    
    public void put(int key, int value) {
        lrCache.put(key, value);
    }
}
