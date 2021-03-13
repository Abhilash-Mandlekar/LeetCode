//Class KV is to store key value
class KV implements Comparable<KV>{
        char s;
        int val;
        public KV(char s, int val){
            this.s = s;
            this.val = val;
        }
        
        public int compareTo(KV O){
            return Integer.compare(O.val, val);
        }
    }

class Solution {
    
    public String frequencySort(String s) {
        // NlogK
        PriorityQueue<KV> maxHeap = new PriorityQueue<KV>();
        Map<Character, Integer> hm = new HashMap<>();
        
        for(char ch: s.toCharArray()){
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);          
        }
        
        for(Map.Entry<Character, Integer> e: hm.entrySet()){
            maxHeap.add(new KV(e.getKey(), e.getValue()));
        }
        
        String result = "";
        while(!maxHeap.isEmpty()){
            
            KV obj = maxHeap.poll();
            int k = obj.val;
            char ch = obj.s;
            
            for(int i=0; i<k; ++i)
            {
                result+= ch;
            }
        }
        
        return result;
    }
}
