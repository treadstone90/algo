class TreeNode:
    
    def __init__(self,val):
        self.left = None
        self.val = val
        self.right = None


class Solution:
    def printAllPaths(self,root):
        self.printAllPathsHelper(root,[])

    def printAllPathsHelper(self,root,out):
        if root.left == None and root.right == None:
            out.append(root.val)
            print out
            out.pop()
        else:
            out.append(root.val)
            if root.left != None:
                self.printAllPathsHelper(root.left, out)
            if root.right != None:
                self.printAllPathsHelper(root.right, out)
            out.pop()

def main():
    root = TreeNode(1)
    root.left = TreeNode(2)
    root.right = TreeNode(3)
    root.right.left = TreeNode(4)
    s = Solution()
    s.printAllPaths(root)

if __name__ == '__main__':
    main()