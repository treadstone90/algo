# here we have queue with max
# have a queue called deq that s going to hve the list of potential canddates
# any number that that is greataer than its orevious will mother that nu,ber
# Meagnin the dequeue shoud be descending order order
# 
from collections import deque
class Queue:

    def __init__(self):
        self.q = []
        self.deq  = deque()

    def push(self,item):
        self.q.insert(0, item)

        if len(self.deq) == 0:
            self.deq.append(item)
        else:

            while len(self.deq) > 0 and self.deq[-1] <= item :
                self.deq.pop()

            self.deq.append(item)





    def pop(self):
        item = self.q.pop()
        if item == self.deq[-1]:
            self.deq.popleft()

        return item


    def max(self):
        return self.deq[0]


    def __str__(self):
        return str(self.q)


def main():
    q = Queue()
    q.push(1)
    q.push(2)
    q.push(3)
    print q.pop()
    q.push(76)
    print q.max()
    print q
    q.push(176)
    print q.max()
    q.pop()
    print q.max()

if __name__ == '__main__':
    main()