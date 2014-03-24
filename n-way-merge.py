import heapq
from heapq import heappush

class Solution:
    def n_way_merge(self,many):
        h = []
        indices = [0]*len(many)
        out = []

        while True:
            for i,array in enumerate(many):
                heappush(h,(array[indices[i]],i))

            element = heapq.heappop(h)
            out.append(element[0])
            indices[element[1]] += 1





def main():
    pass

if __name__ == '__main__':
    main()