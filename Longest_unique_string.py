class Solution:

    def lengthOfLongestSubstring(self, s):
        count =0 
        max_len = 0
        start  = 0
        cache = [-1]*256

        for index,ch in enumerate(s):
            char = ord(ch)
            if cache[char] == -1 or cache[char] < start:
                count += 1
                max_len = max(max_len,count)
                cache[char] = index
            else:
                start = cache[char] +1
                count = index- start +1
                max_len = max(max_len,count)
                cache[char] = index

        return max_len



def main():
    s = Solution()
    print s.lengthOfLongestSubstring("fpdcztbudxfipowpnamsrfgexjlbjrfoglthewbhtiriznzmolehqnlpwxrfowwwjrd")
if __name__ == '__main__':
    main()