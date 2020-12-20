/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        if(root==null) return result;
            
        Queue<Node> q = new LinkedList<Node>();
        List<Integer> res = new ArrayList<Integer>();
        res.add(root.val);
        result.add(res);
        q.offer(root);
        
        while(!q.isEmpty()){ 
                   
            int level = q.size();
            res= new ArrayList<Integer>();
            
            for(int i=0; i<level; ++i){      
                Node nary = q.poll();
                
                List<Node> child = nary.children;
                
                if(!child.isEmpty())
                {

                    for(Node n: child){
                        q.offer(n);
                        res.add(n.val);
                    }
                        
                }
            }
            if(!res.isEmpty())
                result.add(res); 
        }
        return result;
    }
}
