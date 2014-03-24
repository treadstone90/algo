def f(a):
    for i in range(len(a)):
        l = i
        m = 0
        while True:
            if l >= 0 and m < len(a[0]):
                print a[l][m],
                l -=    1
                m += 1
            else:
                print 
                break

    if len(a[0]) > 1:

        for i in range(1,len(a[0])):
            x = i
            y = len(a)-1

            while True:
                if x < len(a[0]) and y >=0:
                    print a[y][x],
                    x += 1
                    y -= 1
                else:
                    print 
                    break




def main():
    a = [[1,2,3],
        [4,5,6],
        [7,8,9],
        [10,11,12]]

    a = [[1,2,3],
        [4,5,6],
        [7,8,9],
        [10,11,12],
        [13,14,15]]
    f(a)

if __name__ == '__main__':
    main()



    int left_max = 0;
      int left_min = 0;
      
      int right_max = 0;
      int right_min = 0;
      
      if(leftSubtree == null) {
        left_max = Integer.MIN_VALUE;
        left_min = Integer.MAX_VALUE; 
      }
      else {
        left_max = leftSubtree.max;
        left_min = leftSubtree.min;
      }
      
      if(rightSubtree == null) {
        right_max = Integer.MIN_VALUE;
        right_min = Integer.MAX_VALUE;
      }
      else {
        right_max = rightSubtree.max;
        right_min = rightSubtree.min;
      }