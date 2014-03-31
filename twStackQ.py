class Queue:

    def __init__(self):
        self.s1 = []
        self.s2 = []

    def push(self,item):
        self.s1.append(item)

    def pop(self):
        if len(self.s2) != 0:
            return self.s2.pop()
        else:
            while len(self.s1) != 0:
                self.s2.append(self.s1.pop())

            return self.s2.pop()

    def size(self):
        return len(self.s1) + len(self.s2)



