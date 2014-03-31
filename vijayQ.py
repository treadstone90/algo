class Solution:

    def generateString(self,str_,index):
        if index == len(str_):
            print str_
            return 

        elif str_[index] == '$':
            str_ = str_[0:index] + '0' + str_[index+1:]
            self.generateString(str_, index+1)
            str_ = str_[0:index] + '1' + str_[index+1:]
            self.generateString(str_, index+1)
        else:
            self.generateString(str_, index+1)



def main():
    s = Solution()
    s.generateString("$ab$c$", 0)

if __name__ == '__main__':
    main()