class Solution:
    def ssDecodeColIs(self,str_): 
        val = 0
        for index,char in enumerate(str_):
            val = val + pow(26,index)*(ord(char) - 65 + 1)

        print val


def main():
    s = Solution()
    s.ssDecodeColIs('AAA')
if __name__ == '__main__':
    main()