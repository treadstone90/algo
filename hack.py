from collections import defaultdict

N = 10
a = [1,1,5,4,3,6,6,5,9,10]

map_ = defaultdict(set)

for i in xrange(N-1):
    for j in xrange(i+1,N):
        if a[j] > a[i]:
            map_[a[i]].add(a[j])


print map_
count = 0


for key in map_.keys():
    greater = map_[key]
    for element in greater:
        print key,element,map_[element]
        count = count + len(map_[element])

print count