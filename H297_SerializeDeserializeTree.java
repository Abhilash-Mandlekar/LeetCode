/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 
 // build tree after constructing pre-order traversal of tree
 
public class Codec {
    List<String> result = new ArrayList<String>(); int i=0;
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        String s = "";
        dfsTree(root);
        
        for(String i: result)
            s+=i;
        
        //System.out.println(s);
        return s;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.equals("")) return null;
        
        String[] nodes = data.split(" ");
        
        return buildTreeFromPreorder(nodes);
    }
    
    public TreeNode buildTreeFromPreorder(String[] nodes){
        String key = nodes[i]; ++i;
        if(key.equals("null")) return null;
        
        
        TreeNode leftTree = buildTreeFromPreorder(nodes);
        TreeNode rightTree = buildTreeFromPreorder(nodes);
        return new TreeNode(Integer.parseInt(key), leftTree, rightTree);
    }
    public void dfsTree(TreeNode root){
        if(root==null)
            return;
        
        result.add(root.val+" ");
        dfsTree(root.left);
        if(root.left==null) result.add("null ");
        dfsTree(root.right);     
        if(root.right==null) result.add("null ");
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
