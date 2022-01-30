class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

class Status:
    def __init__(self, ancestor, val):
        self.ancestor = ancestor
        self.val = val
        
class Solution:
    def lowestCommonAncestor(self, root: 'TreeNode', p: 'TreeNode', q: 'TreeNode') -> 'TreeNode':
        
        def lcaHelper(tree, node0, node1):
            if tree == None:
                return Status(tree, 0)
            
            o1 = lcaHelper(tree.left, node0, node1)
            if o1.val == 2:
                return o1
            
            o2 = lcaHelper(tree.right, node0, node1)
            if o2.val == 2:
                return o2
            
            num = o1.val + o2.val + int(tree is node0) + int(tree is node1)
            
            return Status(tree if num==2 else None, num)
        
        return lcaHelper(root, p, q).ancestor
