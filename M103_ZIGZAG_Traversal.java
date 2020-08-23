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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<TreeNode> rev_q = new ArrayList<TreeNode>();
        
        boolean flag = true;
        
        if(root==null)
            return result;
        
        q.offer(root);
        
        while(!q.isEmpty()){
            int level = q.size();
            List<Integer> li = new ArrayList<Integer>();
            
            
            for(int i=0; i<level; ++i){
                           
                    TreeNode node = q.poll();
                
                    if (flag==true)
                        li.add(node.val);
                    else
                        li.add(0,node.val); // adds elements in the first position which traverses the tree in reverse direction 
                        
                    if(node.left!=null)
                        q.add(node.left);
                    
                    if(node.right!=null)
                        q.add(node.right);
                                                  
            }
            
            // Better way is to do: flag= !flag 
            if(flag==true)
                flag=false;
            else
                flag=true;
            
            result.add(li);
        }
        
        return result;
    }
}
