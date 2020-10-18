class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root==null)
            return res;
        
        
        List<Integer> al = new ArrayList<> ();
        
        String path = ""; int pathSum=0;
        res = addPath(root, res, al);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for(List<Integer> li: res){
            int s=0;
            for(int i: li){
                s+=i;
            }
            if(s==sum)
                result.add(li);
        }

        return result;
    }
    
    public List<List<Integer>> addPath(TreeNode node, List<List<Integer>> res, List<Integer> al){
        if(node==null)
            return res;
        
        // to seperate out each root add blank space to identify each value 
        al.add(node.val);
        addPath(node.left, res, al);
        addPath(node.right, res, al);
        
        //checks if both left and right pointers are null and then adds to list
        if(node.left == null && node.right ==null)
            res.add(new ArrayList<>(al));
        
        al.remove(al.size()-1);
        return res;
    }
             
}
