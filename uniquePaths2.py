class Solution:
	cache = []

	def uniquePathsWithObstacles(self,obstacleGrid):
		for i in range(len(obstacleGrid)):
			Solution.cache.append([-1]*len(obstacleGrid[0]))

		obs = False

		for i in range(len(Solution.cache[0])):
			if Solution.cache[0][i] == 1:
				obs = True

			if obs == False:
				Solution.cache[0][i] = 1
			else:
				Solution.cache[0][i] = 0

		print Solution.cache

		obs = False
		for i in range(len(Solution.cache)):
			if Solution.cache[i][0] == 1:
				obs = True

			if obs == False:
				Solution.cache[i][0] = 1
			else:
				Solution.cache[i][0] = 0
		print Solution.cache

		for i in range(1,len(Solution.cache)):
			for j in range(1,len(Solution.cache[0])):	
				if obstacleGrid[i][j] == 1:
					Solution.cache[i][j] = 0
				else:
					Solution.cache[i][j] = Solution.cache[i-1][j] + Solution.cache[i][j-1]

		print Solution.cache
		ans = Solution.cache[-1][-1]
		Solution.cache = []
		return ans


def main():
	s = Solution()
	print s.uniquePathsWithObstacles([[0]])

if __name__ == '__main__':
	main()