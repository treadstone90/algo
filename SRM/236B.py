def main():
    n,k = map(lambda x:int(x), raw_input().split(" "))
    a = map(lambda x:int(x), raw_input().split(" "))
    count =0
    prev = None
    for i in range(len(a)):
        if prev == None:
            prev = a[i]
        else:
            if a[i] -prev != k:
                if a[i] - prev > 0:
                    print '-',i+1, a[i] - prev - k
                    a[i] = a[i] - (a[i] - prev - k)
                else:
                    print '+',i+1, prev-a[i]+k
                    a[i] = a[i] + prev-a[i]+k
            else:
                count += 1

        prev = a[i]

    if count == len(a)-1:
        print 0


if __name__ == '__main__':
    main() 