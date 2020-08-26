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
    public void flatten(TreeNode root) {
        List<TreeNode> li = new ArrayList<TreeNode>();
        li = preOrderTraversal(root, li);
        //System.out.println(li);
        
        TreeNode node =null;
        for(int i=0; i<li.size()-1; ++i){          
            node = li.get(i);
            node.left = null;
            node.right = li.get(i+1);         
        }
        
        root =node;
    }
    
    public List<TreeNode> preOrderTraversal(TreeNode node, List<TreeNode> li)
    {
        if(node==null)
            return li;
        li.add(node);
        preOrderTraversal(node.left, li);
        preOrderTraversal(node.right, li);
        return li;
    }
}
