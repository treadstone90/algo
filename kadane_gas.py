

def canCompleteCircuit(gas,cost):

    temp = [gas[i]-cost[i] for i in range(len(gas))]
    print temp
    temp_c = [x for x in temp]

    ans,i,j = kadane(temp+ temp_c)
    print ans,i,j


    if ans < 0:
        return -1;
    else:
        if j < i:# wrap around
            omg = sum(temp[j+1:i])
        else:
            omg = sum(temp[j+1:]) + sum(temp[0:i])
        print ans,i,j,omg
        if ans + omg < 0:
            return -1
        else:
            return i

def kadane(a):
    start_index = -1
    end_index = -1
    sumsoFar = 0
    maxSum = -1
    pot_start = 0
    i =0

    while i < len(a):
        sumsoFar += a[i]

        if a[i] > sumsoFar:
            sumsoFar = a[i]
            pot_start  = i

        if sumsoFar > maxSum:
            maxSum = sumsoFar
            start_index = pot_start
            end_index = i

        i += 1

        if (start_index - end_index+1) == len(a)/2:
            break
            

    if end_index >= len(a)/2:
        end_index = end_index % len(a)/2

    return maxSum,start_index,end_index

def main():
    print kadane([2,3,-6,1,1,2,2])
    print kadane([2,3,1,1,2,2])
    print kadane([-1,-2])
    print kadane([0])
    print canCompleteCircuit([2,2], [3,2])
    print canCompleteCircuit([2,2,15], [2,3,10])
    print canCompleteCircuit([2,2,15,20], [2,3,10,24])
    print canCompleteCircuit([67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66], [27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26])
    print canCompleteCircuit([5], [4])
if __name__ == '__main__':
    main()
