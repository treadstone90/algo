def maxJumps(a):
    #give an array find the minimum number of jumps 
    cache  = [len(a)+1]*len(a)
    parent = [-1]*len(a)
    cache[0] = 0
    cache[1] =1
    print a
    print cache

    for i in range(2,len(a)):
        #the distance is j-i, and the maximum possible by j = a[j]
        for j in range(i):
            if(a[j] >= i-j):
                cache[i] = cache[j]+1
                parent[i] = j
                break

    print cache[len(a)-1]

    i=len(a)-1
    while a[i] != -1:
        print a[i]
        i = parent[i]




def LRS(str):
    cache = [False]*256
    i=0
    j=0
    start=0;
    end=0;
    max_len=0
    cur_len= 0

    while j < len(str):
        if(cache[ord(str[j])] == False):
            cache[ord(str[j])] = True
            j+=1
        else:
            #print str[j]
            if(j-i > max_len):
                start = i
                end =j
                max_len = j-i

            while str[i] != str[j]:
                cache[ord(str[i])] = False
                i+=1

            i+=1
            j+=1

    if(len(str)-i > max_len):
        start = i+1
        end =len(str)
        max_len = len(str)-i

    print max_len
    print str[start:end]



def main(N):
    b=[[1,11,5],[2,6,7],[3,13,9],[12,7,16],[14,3,25],[19,18,22],[23,13,29],[24,4,28]]
    max_x=0;
    for triple in b:
        max_x = max(max_x,triple[2])
    print max_x

    height = [0]*max_x

    for triple in b:
        print triple
        for x in range(triple[0],triple[2]):
            height[x] = max(height[x],triple[1])
    print height

    prev_height =-1

    for x in range(1,max_x):
        if(height[x] != prev_height):
            print x, height[x]
            prev_height = height[x]


# a= [a1 a2 a3 a4 a5 a6]
# have 

def LIS(a,i):

    lis = [1]*len(a)
    parent = [-1]*len(a)

    for i in range(len(a)):
        for j in range(i):
            if(a[j] <= a[i]):
                if(lis[j]+1 > lis[i]):
                    lis[i] = lis[j]+1
                    parent[i] =j


    print max(lis), lis.index(max(lis))

    index=lis.index(max(lis))

    while index != -1:
        if(index != -1):
            print a[index]
            index = parent[index]

if __name__ == '__main__':
    #main(30)
    a = [0,8,8,8,8,8]

    LRS("caxbbbbbb")
    LRS("abcdaqtwertyuioooo")
    LRS("abcdaqwertyuioooo")
    maxJumps([1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9])
