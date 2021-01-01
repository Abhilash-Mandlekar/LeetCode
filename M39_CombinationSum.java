class Solution {
    List<List<Integer>> result  = new ArrayList<List<Integer>>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> res = new ArrayList<Integer>();
        findPaths(candidates, res, target, 0,0);
        return result;
    }
    
    public void findPaths(int[] candidates, List<Integer> al, int target, int idx, int sum){
               
        if(sum==target){
            result.add(new ArrayList<Integer>(al)); sum=0;
            return;
        }
        
        if(idx==candidates.length || sum>target)            
            return;    
        
        for(int i=idx; i<candidates.length; ++i){
            sum+= candidates[i]; // 2,4,6, -> 2,4,7
            al.add(candidates[i]); //[2],[2,2],[2,2,2] -> [2,2,3]
            findPaths(candidates, al, target, i, sum); // (idx=0,sum=2),(0, 4), (0, 6)
            sum-=candidates[i]; // 4
            al.remove(al.size()-1);// [2,2]
        }
        
    }
}
