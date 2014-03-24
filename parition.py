class Solution:
    # @param s, a string
    # @return a list of lists of string
    ans = []
    local_ans = []
    def partitionHelper(self, s):
        if s == "":
            copy = [x for x in Solution.local_ans]
            Solution.ans.append(copy)
            return
        else:
            for i in xrange(1,len(s)+1):
                if self.check(s[0:i]) == False:
                    continue
                else:
                    Solution.local_ans.append(s[0:i])
                    self.partitionHelper(s[i:])
                    Solution.local_ans.pop()
            return


    def partition(self,s):
        ans = []
        local_ans = []
        self.partitionHelper(s)
        return Solution.ans

    def check(self,a):
        i = 0
        j = len(a) - 1

        while i < j :
            if a[i] != a[j]:
                return False
            else:
                i += 1
                j -= 1

        return True


def main():
    s = Solution()
    print s.partition("aabaaaaaaa")

if __name__ == '__main__':
    main()