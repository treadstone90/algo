# Definition for a  binary tree node
class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None
        self.next = None

class Solution:
    # @param root, a tree node
    # @return nothing
    def connect(self, root):
        if root == None:
            return
        else:
            first = root
            
            while first != None:
                print first.val
                current = None
                prev = None
                temp = first
                first = None
                
                while temp != None:
                    if temp.left != None:
                        # set first 
                        if first == None:
                            first = temp.left
                            
                        current = temp.left
                        
                        
                        if temp.right != None:
                            temp.left.next = temp.right
                            
                            # set prev
                            if prev != None:
                                prev.next = current
                                
                            prev = temp.right
                        else:
                            if prev != None:
                                prev.next = current
                                
                            prev = temp.left

                    elif temp.right != None:
                        # set first
                        if first == None:
                            first = temp.right
                        
                        if prev != None:
                            prev.next  = temp.right
                            
                        prev = temp.right
                    
                    temp = temp.next

def main():
    r = TreeNode(1)
    r.left = TreeNode(2)
    r.right = TreeNode(3)
    r.left.left = TreeNode(4)
    r.left.right = TreeNode(5)

    s = Solution()
    s.connect(r)

if __name__ == '__main__':
    main()