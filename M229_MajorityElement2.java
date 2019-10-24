class Solution {
    public List majorityElement(int[] nums) {
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        List<Integer> al = new ArrayList<>();
        
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
            if(n>(nums.length/3))
                al.add(entry.getKey());
        }
        return al;
    }
}