from collections import defaultdict
import sys


n,m = map(lambda x:int(x) , raw_input().split(" "))
adj_list = defaultdict(list)
visited = [False]*(n+m+1)

for i in range(1,m+1):
	adj_list[i] = []

def dfs(vertex):
	visited[vertex] = True

	for w in adj_list[vertex]:
		if visited[w] == False:
			dfs(w)


k= 0

for i in range(m+1,m+n+1):
	languages = map(lambda x:int(x) , raw_input().split(" "))
	k += languages[0]

	for lang in languages[1:]:
		adj_list[i].append(lang)
		adj_list[lang].append(i)


if k == 0:
	print n
	sys.exit()

conn_comp = 0

for node in xrange(1,n+m+1):
	if visited[node] == False:
		conn_comp += 1
		dfs(node)


a = sum(map(lambda x: len(adj_list[x]) == 0, xrange(1,m+1)))

print conn_comp - a - 1







