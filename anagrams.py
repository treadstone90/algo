from collections import defaultdict

class Solution:
    # @param strs, a list of strings
    # @return a list of strings
    def anagrams(self, strs):
        dic_ = defaultdict(list)
        
        for word in strs:
            repr_ = [0]*26
            for char in word:
                repr_[ord(char) -  97] += 1

            dic_[str(repr_)].append(word)

        ans = []

        for key in dic_.keys():
            if len(dic_[key]) > 1:
                for word in dic_[key]:
                    ans.append(word)

        return ans

#group set of anagrams
def main():
    s = Solution()
    print s.anagrams(['and','dna','dog','cat','act'])
if __name__ == '__main__':
    main()
