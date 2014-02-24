
# in trees we dont need to use viisted at all cos anyway a node will be visited just once
# then we know that in tree ishbud check that Im not exploring the parent again


class FoxAndTouristFamilies:

	def dfs(self,city,parent,A,B,target,bridge_found):
		count = 0
		if bridge_found == True:
			count = 1

		for road in len(range(A)):
			neighbor = -1
			if(A[road] == city or B[road] == city):
				neighbor = B[road] if (A[road] == city) else A[road]

				bridge_found = (bridge_found or road == target)

				if neighbor != parent:
					count = count + dfs(neighbor,city,A,B,target,bridge_found)
		return count*1.0


	def expectedLength(self, A, B, f):
		# A contains the source city
		# B contains the destination city
		# f contrains the citry of family I
		# starting at every city node ,initiiate DFS
		city_cache=[]
		for road,city in enumerate(A):
			for fam,city in enumerate(family):
				count = dfs(city,-1,A,B,road,False) # thsi will return the number of nodes on the other side of the road
				prob_road = prob_road * (count/len(A)+1)
			length  += prob_road

		return length

