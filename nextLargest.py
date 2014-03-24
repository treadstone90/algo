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

    def nextLargest(self,root,val):
        if root.val == None:
            return -1
        elif root.val > val and root.left == None:
            return root.val
        else:
            if root.val > val:
                self.nextLargest(root.left,val)
            elif root.val <= val:
                self.nextLargest(root.right,val
)

def main():
    pass
if __name__ == '__main__':
    main()