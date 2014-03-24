import sys

def find_min(a):

    if len(a) == 1:
        return 1

    temp = [0]*len(a)
    temp[0] = 1
    prev = a[0]
    prev_val = 1

    for index in range(1,len(a)):
        if a[index] > prev:
            temp[index] = temp[index-1] + 1
            prev = a[index]
            prev_val = temp[index]
        else:
            prev_val = 1
            temp[index] = 1
            prev = a[index]

    prev_val = 1
    prev = a[len(a)-1]

    for index in reversed(range(0,len(a)-1)):
        if a[index] > prev:
            temp[index] = max(temp[index], prev_val+1)
            prev = a[index]
            prev_val = prev_val + 1
        else:
            prev_val = 1
            prev = a[index]

    print temp
    return sum(temp)

def main():
    a = [1,2,3,4,5,6,90]
    print find_min(a)

    a = [100,1,2,4,7,6,5,4,100]
    print find_min(a)

    a = [1,2,1,6,5,10,8,12]
    print find_min(a)

    a = [1,2]
    print find_min(a)


if __name__ == '__main__':
    main()