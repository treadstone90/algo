class Solution:
    # @param an integer
    # @return a list of string
    def generateParenthesis(self, n):
    	self.generateParanthesesHelper("",0,n)

    def generateParanthesesHelper(self,str_,count,n):
    	if count == 0 and len(str_) == n*2:
    		print str_

    	elif count < 0 or len(str_) > n*2:
    		return
    	else:
    		self.generateParanthesesHelper(str_+"(",count+1,n)
    		self.generateParanthesesHelper(str_+")",count-1,n)






def main():
	s = Solution()
	s.generateParenthesis(1)


if __name__ == '__main__':
	main()

        
        
