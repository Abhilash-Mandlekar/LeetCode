class Solution:
    def invertTree(self, root: Optional[TreeNode]) -> Optional[TreeNode]:
        if not root:
            return root
        
        q = []
        q.append(root)
        while q:
            for _ in range(len(q)):
                n = q.pop(0)
                if n.left:
                    q.append(n.left)
                if n.right:
                    q.append(n.right)
                        
                n.left, n.right = n.right, n.left
                  
        
        return root
                
