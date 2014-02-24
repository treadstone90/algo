class Solution:
    # @return a list of lists of length 3, [[val1,val2,val3]]
    def threeSum(self, num):
        ans = []
        num = sorted(num)

        prev = None
        for i in xrange(len(num)-1):
            if num[i] != prev:
                self.twosum(num[i+1:],-num[i],ans)
            prev = num[i]
            
        return ans
    
    def twosum(self,a,target,ans):
        i =0
        j = len(a) -1
        
        while i < j:
            if a[i] + a[j] == target:
                ans.append([target*-1,a[i],a[j]])
                temp = a[i]
                while a[i] == temp and i < j:
                    i += 1
                temp = a[j]
                while a[j] == temp and i < j:
                    j -= 1

            elif a[i] + a[j] < target:
                temp = a[i]
                while a[i] == temp and i < j:
                    i += 1
                
            elif a[i] + a[j] > target:
                temp = a[j]
                while a[j] == temp and i < j:
                    j -= 1
        
                
def main():
    s =  Solution()
    print s.threeSum([1,1,1,1,1,1,1,1,-1,-2,-2,-2])
    print s.threeSum([0,0,0])
    print s.threeSum([1,1,1])
    print s.threeSum([1,-2,1])
    print s.threeSum([-100,100,0,0,0,0,0,0])
    print s.threeSum([-1,0,1,2,-1,-4])

if __name__ == '__main__':
    main()