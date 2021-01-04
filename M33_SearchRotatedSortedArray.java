class Solution {
    public int search(int[] nums, int target) {
        int i=1;
        
        while(i<nums.length){
            if(nums[i-1]<=nums[i])
                ++i;
            else
                break;
        }
        
        if(i==nums.length) 
            return binarySearch(nums,0,nums.length-1, target);
        else if(target<nums[i-1] && target<=nums[nums.length-1])
            return binarySearch(nums,i,nums.length-1, target);
        else 
            return binarySearch(nums,0,i-1, target);
        
    }
    
    // Binary search Algorithm
    public int binarySearch(int[] arr, int left, int right, int target){
        int mid;
        while(left<=right){
            mid = left + (right-left)/2;            
            if(arr[mid]==target)
                return mid;
            else if(target<arr[mid])
                right = mid-1;
            else
                left = mid+1;      
        }
        return -1;
    }
}
