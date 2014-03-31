# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

    def __str__(self):
        return str(self.val)

class Solution:
    # @param head, a ListNode
    # @param x, an integer
    # @return a ListNode
    def partition(self, head, x):
        less = []
        more_than = []
        print 'OW'
        while head != None:
            #print head
            #print head.val
            if head.val < x:
                less.append(head)
            else:
                more_than.append(head)

            head = head.next

        print 'here1'
        while len(more_than) > 0:
            node = more_than.pop()
            node.next = None
            head = self.insert_begin(head,node)

        print 'here2'
        
        while len(less) > 0:
            node = less.pop()
            node.next = None
            head = self.insert_begin(head,node)

        print 'here3'

        return head
        
    def insert_begin(self,head,node):
        if head == None:
            head = node
        else:
            node.next = head
            head = node

        print head
        return head


def main():
    s = Solution()

    head = ListNode(2)
    head.next = ListNode(1)
    #head.next.next = ListNode(50)

    print s.partition(head, 2)

    while head != None:
        print head.val
        head = head.next
if __name__ == '__main__':
    main()
