class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        
        List<String> result = new ArrayList<String>();
        
        if(words.length==0) return result;
        
        //create hash map to store words and its frequency
        // minHeap to store k most frequent elements
        Map<String, Integer> wrdFreq = new HashMap<String, Integer>();
        PriorityQueue<String> minHeap = new PriorityQueue<String>(k, (w1, w2) -> wrdFreq.get(w1).equals(wrdFreq.get(w2)) ?
                w2.compareTo(w1) : wrdFreq.get(w1) - wrdFreq.get(w2));
        
        
        // creates word: frequency mapping
        for(String str: words){
            wrdFreq.put(str, wrdFreq.getOrDefault(str, 0)+1);
        }
        
        //System.out.println(wrdFreq);
        for(Map.Entry<String, Integer> entry: wrdFreq.entrySet()){
            minHeap.offer(entry.getKey());
            if(minHeap.size()>k)
                minHeap.poll();     
        }
        
        while(!minHeap.isEmpty())
            result.add(0,minHeap.poll());
            
        return result;
    }
}
