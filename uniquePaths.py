class Solution:
	cache = []

	def uniquePaths(self,m,n):
		for i in range(m):
			Solution.cache.append([-1]*n)

		for j in range(n):
			Solution.cache[0][j] = 1

		for i in range(m):
			Solution.cache[i][0] = 1

		for i in range(1,m):
			for j in range(1,n):
				Solution.cache[i][j] = Solution.cache[i-1][j] + Solution.cache[i][j-1]
		
		ans = Solution.cache[m-1][n-1]		
		Solution.cache = []
		return ans

def main():
	s = Solution()
	print s.uniquePaths(10,1)


if __name__ == '__main__':
	main()