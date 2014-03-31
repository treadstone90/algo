class Solution:
    # @return an integer
    cache = [[]]
    def uniquePaths(self, m, n):
        for i in range(m):
            Solution.cache.append([-1]*n)
        
        for i in range(n):
            Solution.cache[0][i] = 1
            
        for i in range(m):
            Solution.cache[i][0] = 1
            
        for i in range(1,m):
            for j in range(1,n):
                Solution.cache[i][j] = Solution.cache[i-1][j] + Solution.cache[i][j-1]

        return Solution.cache[m-1][n-1]

def main():
    pass
if __name__ == '__main__':
    main()