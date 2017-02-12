# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def buildTree(self, preorder, inorder):
        """
        :type preorder: List[int]
        :type inorder: List[int]
        :rtype: TreeNode
        """
        if inorder:
            mid = inorder.index(preorder.pop(0))
            root = TreeNode(inorder[mid])
            root.left = self.buildTree(preorder,inorder[:mid])
            root.right = self.buildTree(preorder,inorder[mid+1:])
            return root