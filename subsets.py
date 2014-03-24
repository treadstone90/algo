class Solution:
    # @param S, a list of integer
    # @return a list of lists of integer
    finalAns = []
    def subsets(self, S):
        S = sorted(S)
        self.subsetsHelper(S,[],None,0)
        temp = Solution.finalAns
        Solution.finalAns = []
        return temp
    
    def subsetsHelper(self,S,ans,recentIncluded,index):
        if index == len(S):
            ans = [x for x in ans]
            Solution.finalAns.append(ans)
        else:
            if index >= 1 and S[index] == S[index-1]:
                if recentIncluded == S[index]:
                    ans.append(S[index])
                else:
                    pass
            else:
                ans.append(S[index])
                recentIncluded = S[index]

            self.subsetsHelper(S,ans,recentIncluded,index+1)
            ans.pop()
            if len(ans) > 0:
                recentIncluded = ans[-1]
            else:
                recentIncluded = None
            self.subsetsHelper(S,ans,recentIncluded,index+1)



def main():
    s = Solution()
    print s.subsets([1,2,2])
if __name__ == '__main__':
    main()
