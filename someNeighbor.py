class Solution:
    # @param board, a list of lists of 1 length string
    # @param word, a string
    # @return a boolean
    # i - dx
    # j - dy
    neighbor = {}
    
    def exist(self, board, word):
        dx = [0,0,-1,1]
        dy = [-1,1,0,0]
        
        for i,word in enumerate(board):
            for j,char in enumerate(word):
                print char,word
                if char not in Solution.neighbor:
                    Solution.neighbor[char] = set()
                
                for k in range(len(dx)):
                    if i+dx[k] >=0 and i+dx[k] < len(board) and j+dy[k] >=0 and j + dy[k] < len(word):
                        Solution.neighbor[char].add(board[i+dx[k]][j+dy[k]])
    
        if len(word) == 0:
            print ""== word
        
        
        searchChar = word[0]            
        
        if searchChar in Solution.neighbor:
            li = Solution.neighbor[searchChar]
            
            for char in range(1,len(word)):
                if char not in li:
                    return False
                else:
                    li = Solution.neighbor[char]
            
            return True
        else:
            return False


def main():
    s = Solution()
    print s.exist(["ABCE","SFCS","ADEE"], "ASAD")
    print Solution.neighbor
    
if __name__ == '__main__':
    main()

            
                    
                