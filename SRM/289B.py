import sys

# keepo track of the largest elements

n,m,d = map(lambda x :int(x), raw_input().split(" "))

if n ==m and n == 1:
	print 0
	sys.exit()


matrix = []

mod = None

for i in range(n):
	row = map(lambda x:int(x), raw_input().split(" "))

	for element in row:
		if mod == None:
			mod = element % d
		else:
			if element % d != mod:
				print "-1"
				sys.exit()
				break

	matrix.append(row)

a=[item for row in matrix for item in row]

a = sorted(a)

median = a[n*m/2]

print median

ops = 0
for element in a:
	ops += abs(element-median)/d


print ops



