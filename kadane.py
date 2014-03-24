# Any positive number wil the following number unless it is a negatver
# sum_so far will change only when the sum_so_far become negative
# kdaane requires atleast one positive number
# if there are only negative numbers then we nee4d 
def kadane(a):
	if len(a) == 0:
		return -1
	
	max_sum = a[0]
	max_here = a[0]
	start = 0
	end = 0

	# use sum_so_far as a peioxy
	i = 0

	while i < len(a):
		max_here += a[i]

		if max_here < 0:
		

		if sum_so_far >= max_sum:
			max_sum = sum_so_far
			end = i







	pass