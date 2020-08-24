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
    public List<Integer> rightSideView(TreeNode root) {
        
        List<Integer> result = new ArrayList<Integer>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        
        if(root==null)
            return result;
        
        q.add(root);
        
        while(!q.isEmpty()){
            int level = q.size();
            TreeNode temp = new TreeNode(0);
            
            for(int i=0; i< level ; ++i){
                TreeNode node = q.poll();
                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
                temp = node;
            }
            
            // Add the last captured node to result list
            result.add(temp.val);
        }      
        
        return result;
    }
     
}
