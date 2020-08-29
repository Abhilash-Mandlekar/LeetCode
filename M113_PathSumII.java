/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(root==null)
            return result;
        
        
        List<String> al = new ArrayList<String> ();
        
        String path = ""; int pathSum=0;
        al = addPath(root, al, path);
        //System.out.println(al);
        
        for(String str: al){
            List<Integer> nums = new ArrayList<Integer>();
            String[] paths = str.split(" "); 
            pathSum=0; 
            
            // first string becomes "" hence started from index 1
            for(int i=1; i<paths.length; ++i)
                pathSum+=Integer.parseInt(paths[i]);     
            
            if(pathSum==sum){
                for(int i=1; i<paths.length; ++i)
                    nums.add(Integer.parseInt(paths[i]));                            
            result.add(nums);
            }
        }

        return result;
    }
    
    public List<String> addPath(TreeNode node, List<String> li, String path){
        if(node==null)
            return li;
        
        // to seperate out each root add blank space to identify each value 
        path+= " " + node.val;
        addPath(node.left, li, path);
        addPath(node.right, li, path);
        
        //checks if both left and right pointers are null and then adds to list
        if(node.left == null && node.right ==null){
            li.add(path);
            path = "";
        }
        
        return li;
    }
             
}
