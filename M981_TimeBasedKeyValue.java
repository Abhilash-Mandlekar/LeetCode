class Status{
    String val;
    int time;
    public Status(String val, int time){
        this.val = val;
        this.time = time;
    }
    public int Compare(Status that){
        return this.time - that.time; // sort in ascending
    }
}

class TimeMap {

    /** Initialize your data structure here. */
    Map<String, List<Status>> timeMap;
    
    public TimeMap() {
        timeMap = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        List<Status> arr = timeMap.getOrDefault(key, new ArrayList());
        arr.add(new Status(value, timestamp));
        timeMap.put(key,arr);
        //System.out.println(timeMap);
    }
    
    public String get(String key, int timestamp) {
        if(timeMap.containsKey(key)){
            List<Status> arr = timeMap.get(key);
            return binarySearch(arr, timestamp);
            
        }
        return "";
    }
    
    public String binarySearch(List<Status> arr, int target){
        int left =0; int right = arr.size()-1;
        
        while(left<=right){
            int mid = left+((right-left)/2);
            if(arr.get(mid).time == target)
                return arr.get(mid).val;
            else if(arr.get(mid).time < target)
                left = mid+1;
            else
                right = mid-1;
            
        }
        
        return (left<=0)? "": arr.get(left-1).val;
    }
}
