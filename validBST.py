import sys

# Definition for a  binary tree node
class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

class Solution:
    # @param root, a tree node
    # @return a boolean
    # for every subtree u have a >= and a less = 
    # every node must be within this
    def isValidBST(self, root):
        return self.isValidBSTHelper(root,-sys.maxint-1,sys.maxint)
    
    def isValidBSTHelper(self,root,min_,max_):
        if root == None:
            return True
        else:
            if root.val > min_ and root.val < max_:
                self.isValidBSTHelper(root.left,min_,root.val) and self.isValidBSTHelper(root.right,root.val,max_)
            else:
                return False