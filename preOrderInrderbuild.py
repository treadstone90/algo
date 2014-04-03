class Node:
    def __init__(self,val):
        self.left = None
        self.right = None
        self.val = val

class Solution:

    def __init__(self):
        pass

    def buildTree(self,preOrder,inOrder):
         if inOrder == "":
            return None,preOrder
         else:
            for i in range(len(inOrder)):
                if inOrder[i] == preOrder[0]:
                    break

            left = inOrder[0:i]
            right = inOrder[i+1:]
            node = Node(preOrder[0])
            preOrder = preOrder[1:]
            node.left,preOrder = self.buildTree(preOrder,left)
            node.right,preOrder = self.buildTree(preOrder,right)

            return node,preOrder

    def inOrder(self,root):
        if root == None:
            return
        else:
            self.inOrder(root.left)
            print root.val,
            self.inOrder(root.right)
def main():
    s = Solution()
    node,preOrder = s.buildTree("asd","sad")
    s.inOrder(node)
    print 

    node,preOrder = s.buildTree("asd","dsa")
    s.inOrder(node)
    print 

    node,preOrder = s.buildTree("asd","asd")
    s.inOrder(node)
    print 


    node,preOrder = s.buildTree("dbac","abcd")
    s.inOrder(node)
    print 
if __name__ == '__main__':
    main()



    # so we find the index at whicg D occurs
    # then anyting to left of it becomes the left subtree - so buidTree(C,CE)

    # then buildTree(None,E):
