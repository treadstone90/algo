class Solution:
    def multiply(self,a):
        fwd = [None]*len(a)
        bwd = [None]*len(a)

        mul =1 
        fwd[0] = 1
        for i in range(len(a)-1):
            mul = mul*a[i]
            fwd[i+1] = mul

        bwd[-1] = 1
        mul =1 
        for j in reversed(range(1,len(a))):
            mul = mul*a[j]
            bwd[j-1] = mul

        product = []

        for i in range(len(fwd)):
            product.append(fwd[i] * bwd[i])

        print fwd
        print bwd
        print product




def main():
    s = Solution()
    s.multiply([1,2,3,4,5])
if __name__ == '__main__':
    main()