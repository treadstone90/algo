#binary search
class BinarySearch:

    def __init__(self):
        pass

    # find the exact number
    def bs1(self,a):
        pass

    # YYYYYYYYYYNNNNNNNNN
    #YN
    #YY
    #NN
    # find the largest number smaller than x
    #
    def bs2(self,a,x):

        if a[0] >=x:
            return -1

        lo = 0
        hi = len(a) -1 

        while lo < hi:
            mid = (hi+lo+1)/2

            if a[mid] < x:
                lo = mid
            elif a[mid] >= x:
                hi = mid -1

        return lo

    # find the smallest number larger than x
    #NNNNNNNNNYYYYYYYYYYYY
    #YY
    #NN
    #YN
    #NY
    # here we need to round down 
    # 
    def bs3(self,a,x):

        if a[len(a)-1] <= x:
            return -1

        lo = 0
        hi = len(a) -1 

        while lo < hi:
            mid = (hi+lo)/2

            if a[mid] > x:
                hi = mid
            elif a[mid] <= x:
                lo = mid+1

        return hi


def main(): 
    s= BinarySearch()
    a = [1,4,7,11,56,100]
    print a[s.bs3(a, 56)]
    print a[s.bs2(a, 10)]

    print s.bs3(a, 101)
    print s.bs2(a, 0)

    a = [10,70]

    print s.bs2(a, 20)
    print s.bs3(a, 20)

if __name__ == '__main__':
    main()