// Complexity = binary search complexity log(n)
class Solution {
    public boolean search(int[] nums, int target) {
        if(nums.length==1) return (nums[0]==target) ? true: false;
        int i=1;
        while(i<nums.length && nums[i-1]<=nums[i]) ++i;
        
        // Here "i" is an inflation point
        if(i==nums.length) return (binarySearch(nums,0,nums.length-1, target)!= -1) ? true: false;
        else if(nums[i-1]==target) return true;
        else if(target<nums[i-1] && target<=nums[nums.length-1]) return (binarySearch(nums, i, nums.length-1, target)!= -1) ? true: false;
        else return (binarySearch(nums, 0, i, target)!= -1) ? true: false;
        
    }
    
    // Binary search algorithm
    public int binarySearch(int[] nums, int left, int right, int target){
        int mid;
        
        while(left<=right){
            mid = left + (right-left)/2 ;
            if(nums[mid]==target)
                return mid;
            else if(target<nums[mid])
                right = mid - 1;
            else
                left = mid + 1;
        }
        
        return -1;
    }
}
