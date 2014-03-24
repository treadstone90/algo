class node:

    def __init__(self,val):
        self.val = val
        self.left = None
        self.right = None




class Solution:

    def LCA2(self,root,n1,n2):
        if root == None:
            return None
        else:
            if root == n1 or root == n2:
                return root

            # Three cases
            # 1. Both nodes in left subtree, both ndes in the right subtree, nodes in one of the subtrees

            left = self.LCA2(root.left,n1,n2)
            right = self.LCA2(root.left,n1,n2)

            if left == None:
                return right
            elif right == None:
                return left
            else:
                return root

    def LCA1(self,root,node1,node2):
        a = []
        b = []
        self.paths(root,node1,a)
        self.paths(root,node2,b)

        while a[-1] != b[-1]:
            if len(a) > len(b):
                a.pop()
            elif len(b) > len(a):
                b.pop()
            else:
                a.pop()
                b.pop()

        return a.pop()


    def paths(self,root,node1,path):
        if root == None:
            return False
        elif root == node1:
            path.append(root)
            return True
        else:
            if self.paths(root.left,node1,path) or self.paths(root.right,node1,path) :
                path.append(root)
                return True
            else:
                return False

    def bsinsert(self,root,val):
        if root == None:
            return node(val)
        else:
            if val > root.val:
                if root.right == None:
                    root.right = node(val)
                else:
                    self.bsinsert(root.right, val)
            elif val < root.val:
                if root.left == None:
                    root.left = node(val)
                else:
                    self.bsinsert(root.left, val)


def main():
    s = Solution()
    root = s.bsinsert(None,20)
    s.bsinsert(root, 3)
    s.bsinsert(root, 12)

if __name__ == '__main__':
    main()