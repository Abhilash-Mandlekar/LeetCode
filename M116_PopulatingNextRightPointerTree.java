/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val,Node _left,Node _right,Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/
class Solution {
    public Node connect(Node root) {
        if(root==null)
            return null;
        
        
        Queue<Node> q = new LinkedList<Node>();
        Node temp = root;
        List<TreeNode> li = new ArrayList<TreeNode>();
        Node result = new Node(0);
        q.add(root);
        q.add(null);
        
        while(!q.isEmpty()){
            
            int level = q.size();
            
            //At any time if size of queue is one and the element is null break and return queue
            if(q.size()==1 && q.element()==null)
                break;
            
            for(int i=0; i<level-1; ++i){
                
                Node n = q.poll();
                
                result = n;                
                result.next = q.element();
                    
                //System.out.println(n.val);
                //System.out.println(q);
                
                if(n.left!=null) q.add(n.left); 
                if(n.right!=null) q.add(n.right);
                
                result = result.next;
            }
            
            // if only 'null' in queue remove it
            if(q.element()==null)
                q.poll();
            
            // adds null after every level of trversal
            q.add(null);
           
        }
        result = temp;
        return result;
    }
}
