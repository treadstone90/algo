def rotate(a,k):
    if len(a) % 2 == 0 and len(a)/2 == k:
        for i in range(0,len(a)/2):
            swap1(a,i,(i+k) % len(a))

    else:
        rounds = 0
        i = 0
        temp = a[i]

        while rounds < len(a):
            temp = swap2(temp,a,(i+k)%len(a))
            rounds += 1
            i = (i+k) % len(a)

    return a

def swap1(a,i,j):
    temp = a[i]
    a[i] = a[j]
    a[j] = temp

def swap2(var,a,index):
    temp = var
    var = a[index]
    a[index] = temp

    return var




def main():
    print rotate([1,2,3,4],2)
    print rotate([1,2],1)
    print rotate([1,2,3,4,5,7],3)
    print rotate([1,2,5,7,8,9,10],4)

if __name__ == '__main__':
    main()