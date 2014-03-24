from collections import defaultdict

class Solution:
    def isPalndrome(self,str_):
        dic = defaultdict(int)

        for char in str_:
            dic[char] += 1

        odd_count = 0
        for count in dic.values():
            if odd_count > 1:
                return False
            
            if count % 2 != 0:
                odd_count += 1

        return True


def main():
    s = Solution()
    print s.isPalndrome("f")
    print s.isPalndrome("f")
    print s.isPalndrome("f")


if __name__ == '__main__':
    main()