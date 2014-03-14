
# the issue with this code is that, it will suffer from stack overflow. 
# So u need to implement this using stacks, that is the recursion.

class Solution:
    visited = []
    s = []

    def solve(self,board):
        
        for i in range(len(board)):
            Solution.visited.append([False]*len(board))

        x = 0
        for y in range(len(board[0])):
            if board[x][y] == 'O' and Solution.visited[x][y] == False:
                self.dfs(x,y,board)

        x = len(board)-1
        for y in range(len(board[0])):
            if board[x][y] == 'O' and Solution.visited[x][y] == False:
                self.dfs(x,y,board)
        y = 0
        for x in range(len(board[0])):
            if board[x][0] == 'O' and Solution.visited[x][y] == False:
                self.dfs(x,y,board)

        y = len(board)-1
        for x in range(len(board[0])):
            if board[x][y] == 'O' and Solution.visited[x][y] == False:
                self.dfs(x,y,board)

        for x in range(len(board)):
            for y in range(len(board[0])):
                if board[x][y] == 'O' and Solution.visited[x][y] == False:

                    temp = list(board[x])
                    temp[y] = 'X'
                    board[x] = ''.join(temp)
                    
        print 'ans'
        for row in board:
            print row
        return board

    def dfs(self,x,y,board):

        dx = [1,-1,0,0]
        dy = [0,0,1,-1]

        Solution.visited[x][y] = True


        for i in range(4):
            n_x = x+dx[i]
            n_y = y+dy[i]

            if n_x < 0 or n_x >= len(board) or n_y < 0 or n_y >= len(board):
                continue

            if Solution.visited[n_x][n_y] == False and board[n_x][n_y] == 'O':
                self.dfs(n_x,n_y,board)



def main():
    s = Solution()
    board = []

    # for i in range(4):
    #     board.append(raw_input().split(" "))
    board = ["OO","OO"]

    for row in board:
        print row
    s.solve(board)

if __name__ == '__main__':
    main()