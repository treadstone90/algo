from collections import defaultdict


# the idea is to do dfs and on the backtrack get the set every ndoe to the count iof the problem roads that can be solved
# from it

n = int(raw_input())

adj_list ={}
problem = set()
visited = [False]*n
problem_count = [0]*n


for i in range(n-1):
	source, dest,label = map(lambda x:int(x), raw_input(" ").split())
	adj_list[source].append(dest)
	adj_list[dest].append(source)
	problem.add((source,dest))



