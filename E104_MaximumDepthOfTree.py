class Solution:
    def maxDepth(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        def dfsTree(tree, depth):
            if not tree:
                return depth
            l = dfsTree(tree.left, depth+1)
            r = dfsTree(tree.right, depth+1)
            return max(l,r)
        
        
        return dfsTree(root, 0)
