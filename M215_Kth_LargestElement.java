class Solution {
    public int findKthLargest(int[] nums, int k) {
    
        //Initialize min heap because it will remove minimum from its roots
        PriorityQueue<Integer> p = new PriorityQueue<Integer>(k);
        int result = 0;
        
        for(int i: nums){
            if(p.size()>k)
                p.poll();
            
            p.offer(i);                
        }
        
        if(p.size()==k+1)
            p.poll();
        
        return p.poll();
    }
}
