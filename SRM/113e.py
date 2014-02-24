# this is right. Atkeast now I know how to optimize


n = 10000000

nea = 0
past = 1 

for i in range(2,n+1):
	ans = ((3*nea) + (past << 1)) % 1000000007
	nea = past
	past = ans

print 3*nea % 1000000007

