from collections import defaultdict
import sys


def dfs(vertex):
	visited[vertex] = True
	vertices.append(vertex)

	for w in adj_list[vertex]:
		if visited[w] == False:
			dfs(w)


n,m = map(lambda x:int(x), raw_input().split(" "))

adj_list = defaultdict(list)
visited = [False]*(n+1)

for index in range(m):
	start,end = map(lambda x:int(x), raw_input().split(" "))
	adj_list[start].append(end)
	adj_list[end].append(start)

conn_comp = 0

twos = []
ones = []
threes = []


for node in range(1,n+1):
	if visited[node] == False:
		conn_comp += 1
		vertices = []
		dfs(node)
		if len(vertices) > 3:
			print "-1"
			sys.exit()
		elif len(vertices) == 3:
			threes.append(vertices)
			# we have a super group
		elif len(vertices) == 1:
			ones.append(vertices[0])
		elif len(vertices) == 2:
			twos.append(vertices)



if len(ones) - len(twos) < 0 or (len(ones) - len(twos))%3 != 0:
	print "-1"

else:
	for group in threes:
		print group[0],group[1],group[2]

	for i in range(len(twos)):
		print twos[i][0],twos[i][1],ones.pop()

	for i in xrange(0,len(ones),3):
		print " ".join(str(e) for e in ones[i:i+3])


