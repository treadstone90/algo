from fractions import Fraction
from collections import defaultdict
class Point:
    def __init__(self, a=0, b=0):
        self.x = a
        self.y = b

class Solution:
    # @param points, a list of Points
    # @return an integer
    def maxPoints(self, points):
        dic = defaultdict()
        inf_flag = False
        for i in xrange(len(points)):
            cache = [False]*len(points)

            for j in xrange(i+1,len(points)):
                if cache[j] == True:
                    continue

                if points[i].x == points[j].x:
                    slope = float("inf")
                    intercet = points[i].x
                    inf_flag =  True
                else:
                    slope = Fraction(points[i].y - points[j].y, points[i].x - points[j].x)
                    intercet = Fraction(points[i].y) - slope*points[i].x
                    inf_flag = False

                line = (slope,intercet)

                if line not in dic:
                    dic[line] = 2
                else:
                    continue

                #TODO use these indices in j, will make code faster and O(N^2)
                for k in xrange(j+1,len(points)):
                    if inf_flag == True and cache[k] == False and (points[k].x == intercet):
                        cache[k] = True
                        dic[line] += 1

                    elif inf_flag == False and cache[k] == False and (points[k].y == slope*points[k].x + intercet):
                        cache[k] = True
                        dic[line] += 1

        return max(dic.values())



def main():
    s = Solution()
    print s.maxPoints([Point(0,0),Point(1,1),Point(2,2),Point(3,3),Point(5,6),Point(7,7),Point(6,7)])
    print s.maxPoints([Point(5,6),Point(7,7),Point(6,7)])
    print s.maxPoints([Point(1,1),Point(2,5),Point(1,7)])
    print s.maxPoints([Point(1,2),Point(1,3),Point(1,4),Point(2,2)])
    print s.maxPoints([Point(1,2),Point(1,3),Point(1,4),Point(2,2)])
    print s.maxPoints([Point(0,1),Point(0,2),Point(2,2)])

if __name__ == '__main__':
    main()

