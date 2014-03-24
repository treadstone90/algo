class Max_Stack:
    stack = []
    max_stack = []

    def push(self,item):
        if len(self.stack) == 0:
            self.max_stack.append(item)
        elif item > self.max_stack[-1]:
            self.max_stack.append(item)
        else:
            self.max_stack.append(self.max_())

        self.stack.append(item)

    def pop(self):
        self.stack.pop()
        self.max_stack.pop()

    def max_(self):
        return self.max_stack[-1]

def main():
    s = Max_Stack()
    s.push(1)
    s.push(2)
    s.push(5)
    s.push(9)
    s.push(-1)
    s.push(-1)
    s.push(-1)
    s.push(100)
    print s.max_()
    s.pop()
    print s.max_()
if __name__ == '__main__':
    main()