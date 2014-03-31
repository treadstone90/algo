n,k = map(lambda x:int(x), raw_input().split(" "))
a = map(lambda x:int(x), raw_input().split(" "))


# we need to compute the maximum of all sums which have lenth k. But only go till n-k positions. Since we 
# want some remaining for b.
i = 0
j = i + k
sum_ = sum(a[i:j])
max_sum = sum_
max_a = 0

while j < len(a) - k:
    sum_ = sum_ + a[j]

    if sum_ > max_sum:
        max_a = i
        max_sum = sum_

    sum_ = sum_ - a[i]
    j += 1
    i += 1
    


print i

def max_sum_k(a,k):
    # takes an array and outputs the max_sum array of length k
    # with an index and the maximum sum
    # time taken is O(n)

    sum_ = sum(a[0:k])
    max_sum = sum_
    max_index = 0
    i = 1
    j = i+k


    while j < len(a)- k:
        sum_ = sum_ + a[j]

        if sum_ > max_sum:
            max_a = i
            






