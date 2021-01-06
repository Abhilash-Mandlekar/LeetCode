class Solution {
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    List<Integer> paths = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        int nums[] = {1,2,3,4,5,6,7,8,9};   
        findPaths(nums,k,n,0,0,0);
        return result;
    }
    
    public void findPaths(int[] nums, int k, int n, int sum, int idx, int c){
        if(sum==n && c==k){
            result.add(new ArrayList<>(paths));
            return;
        }
        if(idx>=nums.length)
            return;
        
        for(int i=idx; i<nums.length; ++i){
            sum+=nums[i];
            c++;
            paths.add(nums[i]);
            findPaths(nums,k,n,sum,i+1,c);
            
            // Backtracking starts here
            sum-=nums[i];
            c--;
            paths.remove(paths.size()-1);
        }
    }
}
