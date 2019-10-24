class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>(); int max=0;
        for(int i=0; i<nums.length;i++){
            if(!hm.containsKey(nums[i])){
                hm.put(nums[i],1);
            }
            else{
                hm.put(nums[i], hm.get(nums[i])+1);
            }
        }
        
        for(Map.Entry<Integer, Integer> entry : hm.entrySet())
        {
            int n = entry.getValue();
            if(n>(nums.length/2))
                max = entry.getKey();
        }
        return max;
    }
}