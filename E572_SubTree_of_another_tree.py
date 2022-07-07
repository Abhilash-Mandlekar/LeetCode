class Solution:
    def isSubtree(self, root: Optional[TreeNode], subRoot: Optional[TreeNode]) -> bool:
        if not root and not subRoot:
            return True
        
        if not root:
            return False
        
        def dfsTree(tree, sub):
            if not tree:
                return False
            
            if tree.val == sub.val and validateTree(tree, sub):
                return True
                
            return dfsTree(tree.left, sub) or dfsTree(tree.right, sub)
            
        def validateTree(t, subTree):
            
            if not t and not subTree:
                return True
            
            if not t or not subTree:
                return False
            
            if t.val != subTree.val:
                return False
            
            return validateTree(t.left, subTree.left) and validateTree(t.right, subTree.right)
            
         
        return True if dfsTree(root, subRoot) else False
