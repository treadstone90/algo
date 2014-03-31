class Solution:

    def reverseLine(self,str_):
        start  = 0
        end  = 0

        while end < len(str_) and str_[end] == ' ':
            end += 1
        start = end

        while end < len(str_):
            if str_[end] == ' ':
                self.reverseWord(str_, start, end-1)
                while end < len(str_) and str_[end] == ' ':
                    end += 1
                start = end
            else:
                end += 1

        if start != end:
            self.reverseWord(str_, start, end-1)

        self.reverseWord(str_, 0, len(str_)-1)
        return ''.join(str_)


    def reverseWord(self,str_,start,end):

        while start < end:
            self.swap(str_,start,end)
            start += 1
            end -= 1

    def swap(self,str_,i,j):
        temp = str_[i]
        str_[i] = str_[j]
        str_[j] = temp

def main():
    s = Solution()
    print s.reverseLine(list(" "))
    print s.reverseLine(list(""))
    print s.reverseLine(list("   "))
    print s.reverseLine(list("a  "))
    print s.reverseLine(list("Karthik is aaaaannnnddd      iuj"))
    print s.reverseLine(list(" "))

if __name__ == '__main__':
    main()