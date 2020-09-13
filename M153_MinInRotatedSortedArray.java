class Solution {
    public int findMin(int[] nums) {
    // This is a linear search. WE can optimize it by using binary search
        int i=0;
        
        if(nums.length==1)
            return nums[0];
        
        for(i=0; i<nums.length-1; ++i){
         int sum = nums[i] - nums[i+1];
            if(sum<0)
                continue;
            else
                break;
        }
        
        if(i==nums.length-1)
            return nums[0];
        else
            return nums[i+1];
    }
}
