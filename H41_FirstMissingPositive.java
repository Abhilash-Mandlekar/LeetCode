class Solution {
    public int firstMissingPositive(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int max=0;
        for(int i=0; i<nums.length; ++i){
            result.add(nums[i]);
            if(max<nums[i])
                max = nums[i];
        }
        
        for(int i=1; i<max; ++i){
            if(result.contains(i))
                continue;
            else
                return i;
        }
        
        return max + 1;
    }
}
