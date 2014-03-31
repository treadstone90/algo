class Solution:

    table = []
    result = []
    def __init__(self):
        Solution.table.append("")
        Solution.table.append("@")
        Solution.table.append("abc")
        Solution.table.append("def")
        Solution.table.append("ghi")
        Solution.table.append("jkl")
        Solution.table.append("mno")
        Solution.table.append("pqrs")
        Solution.table.append("tuv")
        Solution.table.append("wxyz")

    def letterCombinations(self, digits):
        self.letterCombinationsH(digits, [])
        ans = Solution.result
        Solution.result = []
        Solution.table = []
        return ans

    def letterCombinationsH(self,digits,result):
        
        if digits == "":
            if result != "":
                Solution.result.append("".join(result))
        else:
            for char in Solution.table[int(digits[0])]:
                result.append(char)
                self.letterCombinationsH(digits[1:], result)
                result.pop()


def main():
    s = Solution()
    print s.letterCombinations("234")
if __name__ == '__main__':
    main()
