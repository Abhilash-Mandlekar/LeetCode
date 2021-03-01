class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int sum=0;
        int result = Integer.MAX_VALUE;
        int left=0, right=0;
        
        while(right<nums.length){
            sum+=nums[right];
            // only handle left pointer of window
            while(sum>=target){
                result = Math.min(result, right - left + 1);
                sum-=nums[left];
                ++left;
            }     
            
            ++right;
        }
        return ((right - left)==nums.length && sum<target)? 0: result;
    }
}
