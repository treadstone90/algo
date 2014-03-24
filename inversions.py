class Solution:
    # return a number
    def inversions(self,a):

        if len(a) == 1:
            return (a,0)
        else:
            sub_ar1,inv1 = self.inversions(a[0:len(a)/2])
            sub_ar2,inv2 = self.inversions(a[len(a)/2:])
            (count,c) = self.merge(sub_ar1,sub_ar2)

            print sub_ar1,sub_ar2,c
            return (c,count+inv1+inv2)

    # return a merged array such that 
    def merge(self,a,b):
        count = 0
        i = 0
        j = 0

        while i < len(a) and j < len(b):
            if a[i] > b[j]:
                count += len(a) - i
                j += 1
            elif a[i] <= b[j]:
                i += 1

        i = 0
        j = 0
        c = []

        while i < len(a) or j < len(b):
            if i == len(a):
                c.append(b[j])
                j += 1
            elif j == len(b):
                c.append(a[i])
                i += 1
            elif a[i] < b[j]:
                c.append(a[i])
                i += 1
            elif b[j] <= a[i]:
                c.append(b[j])
                j += 1

        return (count,c)

def main():
    s = Solution()
    print s.inversions([10])

if __name__ == '__main__':
    main()