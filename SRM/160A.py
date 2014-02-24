n = int(raw_input())
coins = map(lambda x:int(x), raw_input().split(" "))

coins = sorted(coins,reverse=True)

total_sum = sum(coins)
sum_ = 0

n = 0

for coin in coins:
    sum_ += coin
    total_sum -= coin

    n += 1
    if sum_ > total_sum:
        break


print n

