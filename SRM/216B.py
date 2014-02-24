import math

n,k,l,r,sall,sk  = map(lambda x: int(x), "1000 700 782 1000 892330 648282".split(" "))


srem = sall - sk

# so the sum of numbers from k to n-1 is srem
# the min is l and the max is r
out = [None]*n

min_possible = srem/(n-k) + math.ceil(1.0*(srem%(n-k))/(n-k))

print min_possible

for i in range(k,len(out)):
		out[i] = min_possible
		srem -= min_possible

print srem

if srem > 0:
	print out[n-1]
	
	out[n-1] += srem
	srem -= srem

print sum(out[k:]), sall-sk

min_possible = max(min(out[k:]),int(math.ceil(sk/k)))

print min_possible


for i in range(0,k):
	out[i] = min_possible
	sk -= min_possible


print sk
print srem

print sum(out[0:k])
print sum(out)

print out





