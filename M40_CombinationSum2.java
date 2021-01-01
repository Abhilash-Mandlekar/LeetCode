class Solution {
    List<List<Integer>> result  = new ArrayList<List<Integer>>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> res = new ArrayList<Integer>();
        // Sort in order to avoid [1,2,1]  and [1,1,2] as different. By Sorting we can make them as [1,1,2] avaoiding later [1,2,1] or [2,1,1]
        Arrays.sort(candidates);
        findPaths(candidates, res, target, 0,0);
        return result;
    }
    
    public void findPaths(int[] candidates, List<Integer> al, int target, int idx, int sum){
               
        if(sum==target){
            result.add(new ArrayList<Integer>(al)); 
            sum=0;
            return;
        }
        
        if(idx==candidates.length || sum>target)            
            return;    
        
        for(int i=idx; i<candidates.length; ++i){
            if(i>idx && candidates[i]==candidates[i-1]) continue;
            sum+= candidates[i]; // 2,4,6, -> 2,4,7
            al.add(candidates[i]); //[2],[2,2],[2,2,2] -> [2,2,3]
            
            findPaths(candidates, al, target, i+1, sum); // (idx=0,sum=2),(0, 4), (0, 6)
            sum-=candidates[i]; // 4
            al.remove(al.size()-1);// [2,2]
            //System.out.println(al);
        }
        
    }
}
