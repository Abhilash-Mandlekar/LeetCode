class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        List<Integer> p = new ArrayList<>();
        List<Integer> q = new ArrayList<>();
        int[] result = new int[nums.length];
        p.add(1); q.add(1);
        
        int j=0;
        
        for(int i: nums){
            p.add(p.get(j++)*i);
        }
        
        j=0;
        for(int i=nums.length-1; i>=0; --i){
            q.add(q.get(j++)*nums[i]);
        }
        
        
        for(int i=0; i<nums.length; ++i){
            result[i] = p.get(i)*q.get(nums.length-i-1);
        }
        
        return result;
    }
}
