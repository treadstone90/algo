import operator
from operator import itemgetter
from collections import defaultdict


def mykey(x):
    return x[0],-x[1]

n,k = map(lambda x:int(x), raw_input().split(" "))


l = []
for i in xrange(n):
    a,b = map(lambda x:int(x), raw_input().split(" "))
    l.append((a,b))

l = sorted(l, key=mykey,reverse = True)

#print l
dic= defaultdict(int)

for item in l:
    dic[item] += 1

print dic[l[k-1]]



