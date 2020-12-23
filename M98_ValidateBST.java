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
    
    public boolean isValidBST(TreeNode root) {  
        // In interviews we can use LOW = Integer.MIN_VALUE, HIGH = Integer.MAX_VALUE dfsBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
        // So that we can use Integer.compare(root.val, low) in the fuction without checking if low and high are null or not
        return dfsBST(root, null, null);
    }
    
    public boolean dfsBST(TreeNode root, Integer low, Integer high){
        
        if(root==null)
            return true;
        else if((high!=null && root.val>=high) || (low!=null && root.val<=low)) // we can avoid this by Integer.compare()
            return false;
            
        boolean left = dfsBST(root.left, low, root.val);
        boolean right = dfsBST(root.right, root.val, high);
        
        return (left && right);
    }
  
}
