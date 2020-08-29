/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    
    public int sumNumbers(TreeNode root) {
       
        if(root==null)
            return 0;
        
        List<String> al = new ArrayList<String> ();
        int sum = 0;
        String path = "";
        al = addPath(root, al, path);
        
        for(String str: al)
            sum += Integer.parseInt(str);
        
        return sum;
     }
    
    // function that creats and returns the path
    public List<String> addPath(TreeNode node, List<String> li, String path){
        if(node==null)
            return li;
        
        path+=node.val;
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
    
    
