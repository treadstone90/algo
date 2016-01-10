/**
 * Created by karthik on 8/12/15.
 */
public class Bits {
    public int hammingWeight(int n) {
        if(n == 0) {
            return 0;
        } else {
            int mask = 1;
            int count = 0;
            while(n != 0) {
                if((mask & n) != 0) {
                    count++;
                }
                n = n >> 1;
            }
            return count;
        }
    }
}
class Solution {
    /*
        *I am going to mark the
        encoding - convert all reachable Os to T's
        then after evertyhing just make all 0's as X's
    */
    boolean[][] visited = null;
    int[] dx = new int []{1, -1, 0, 0};
    int[] dy = new int[] {0, 0, -1, 1};
    public void solve(char[][] board) {
        visited = new boolean[board.length][board[0].length];
        for(int i=0;i<board[0].length;i++) {
            if(board[0][i] == 'O') {
                dfs(0, i, board, board.length, board[0].length);
            }
        }

        for(int i=0;i<board.length;i++) {
            for(int j=0;j<board[0].length;j++) {
                if(board[i][j] == 'T') {
                    board[i][j] = 'O';
                } else if(board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
            }
        }

    }

    public void dfs(int x, int y, char[][] board, int rowMax, int colMax) {
        board[x][y] = 'T';
        for(int i=0;i<dx.length;i++)  {
            int neighborx = x+dx[i];
            int neighbory = y + dy[i];

            if(neighborx >= 0 && neighborx < rowMax && neighbory >=0 && neighbory < colMax && board[neighborx][neighbory] == 'O') {
                dfs(neighborx, neighbory, board, rowMax, colMax);
            }
        }
    }
}
