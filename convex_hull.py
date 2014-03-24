def convex_hull(points):
  stack =[]
  sort(points)

  #lower part of the hul
  # is it is zero or anti clockwise I ca add else pop
  # so If I have clockweise I need to pop that pount
  lower=[]
  upper=[]
  for i in range(len(points)):

    while len(lower) >= 2 and cross_product(lower[-1], lower[-2]) <=0:
      lower.pop()

    lower.append(points[i])

  for i in reverse(range(len(points))):

    while len(upper) >=3 and cross_product(upper[-1],upper[-2]) <=0:
      upper.pop()

    upper.append(points[i])
  s





