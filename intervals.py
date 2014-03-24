# Definition for an interval.
class Interval:
    def __init__(self, s=0, e=0):
        self.start = s
        self.end = e

    def __str__(self):
        return str(self.start) + " " + str(self.end)

class Solution:
    # @param intervals, a list of Intervals
    # @param newInterval, a Interval
    # @return a list of Interval
    def insert(self, intervals, newInterval):
        s = []
        
        i = 0
        
        for index,interval in enumerate(intervals):

            if newInterval.start >= interval.start and newInterval.end < interval.end:
                s.append(interval)
                break

            elif newInterval.start < interval.start and newInterval.end <= interval.start:
                s.append(newInterval)
                s.append(interval)
                break

            elif newInterval.start < interval.start and newInterval.end <= interval.end:
                inter = Interval(newInterval.start,interval.end)
                s.append(inter)
                break

            elif newInterval.start < interval.start and newInterval.end >= interval.end:
                continue

            elif newInterval.start >= interval.start and newInterval.start  >= interval.end:
                s.append(interval)

            elif newInterval.start >= interval.start and newInterval.end >= interval.end:
                newInterval = Interval(interval.start,newInterval.end)
                if index == len(intervals) -1:
                    s.append(newInterval)
                else:
                    pass


        for i in range(index+1,len(intervals)):
            s.append(intervals[i])


        for interval in s:
            print 'here',interval.start,interval.end
        return s


def main():
    s = Solution()
    print s.insert([Interval(1,3),Interval(6,9)], Interval(2,5))
    print s.insert([Interval(1,2),Interval(3,5),Interval(6,7),Interval(8,10),Interval(12,16)], Interval(4,9))
    print s.insert([Interval(1,5)], Interval(1,7))
    
if __name__ == '__main__':
    main()