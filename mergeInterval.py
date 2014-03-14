class Interval:
    def __init__(self, s=0, e=0):
        self.start = s
        self.end = e

class Solution:
    # @param intervals, a list of Intervals
    # @param newInterval, a Interval
    # @return a list of Interval
    def insert(self, intervals, newInterval):
        # find the smallest interval such that newInterval.start 
        for interval in intervals:
            if newInterval.start < 

    

    def binarySearchStart():
        pass

    #find smallest interval such that interval.end <= newInterval
    def binarySearchEnd(intervals,newInterval):
        start  = 0
        end = len(intervals) -1

        while( start < end):
            mid = (start + end)/2

        if intervals[mid].end < newInterval.start:
            end = mid+1
            
        elif intervals[mid].end >= intervals[mid].start:
            start = mid

        return hi




    
def main():
    s = Solution()
    print s.insert([Interval(1,3),Interval(6,9)],Interval(2,5))

if __name__ == '__main__':
    main()