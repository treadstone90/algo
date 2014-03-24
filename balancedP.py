
# balanced paranthesis is just full backtracking search.
# nothing awesome about it
def balancedParanthesis(n,open_count, closed_count,i,str):
    # we will have 2n chacters , then for each character count we have two choices to make , which is either choose 
    # { or }
    if(i == 2*n and open_count ==  closed_count):
        print str
        return 1
    elif( i == 2*n and open_count != closed_count):
        return -1
    elif(closed_count > open_count):
        return -1
    else:
        balancedParanthesis(n, open_count+1, closed_count, i+1, str +"{")
        balancedParanthesis(n, open_count, closed_count+1, i+1, str +"}")

# Longes increasing subsequence.Some unordered set of numbers.Find the set of numbers that 
#f(i) is the LIS till index i including
#f(0) = a[0]
#f(i) = f(i-1) + a[i] if a[i] > max(current sequence)
#f(i) = a[i] // if a[i] > f(i-1) // pop the list and start from here 
#5 2 8 6 3 6 9 7 
# f=[]
# currentMax = -1
# def LIS(a,i):
#     if(f[i] != -1):
#         return f[i]
#     elif(i == 0):
#         currentMax = a[0]
#         return f[0]
#     else:
#         f_prev = LIS(a,i-1)
#         if(a[i] > currentMax):
#             currentMax = a[i]
#             f[i] = f_prev + a[i]
#         else:
#             if(a[i] > f_prev):
#                 f[i] = a[i]
#                 currentMax = a[i]
#         return f[i]


# nth number
def fib(n):
    a = 0
    b= 1
    if(n == 0):
        return 0
    elif(n==1):
        return 1
    else:
        count=2
        print 0 ,1
        while count < n:
            c = a+b
            print c
            a = b
            b = c
            count = count+1

def fibUpN(n):
    a=0
    b=1
    if(n==0):
        print 0
    elif(n == 1):
        print 1
    else:
        print 0,1
        while 1:
            c = a+b
            if( c <= n):
                print c
                a = b
                b = c
            else:
                break

if __name__ == '__main__':
#    balancedParanthesis(3,0,0,0,"")
    #f= -1*len(a)
    #f[0] = a[0];
    #LIS(a,len(a))
    #fib(8)
    fibUpN(13)
    #balancedParanthesisDP

#upto nth number
def fib(n):
    a=0
    b=1

def LCS(root,p,q):
    if(root == null):
        return
    else:
        left = LCS(root.left, p, q)
        rght = LCS(root.right, p, q)

        if(root == left):
            return left
        elif(root == right):
            return right
        elif(left != null && right != null):
            print "Im the LCA"
            System.exit(0)
        if(left == null && right == null):
            return null
        elif(left ! = null && right != null):

Node *LCA(Node *root, Node *p, Node *q) {
  if (!root) return NULL;
  if (root == p || root == q) return root;
  Node *L = LCA(root->left, p, q);
  Node *R = LCA(root->right, p, q);
  if (L && R) return root;  // if p and q are on both sides
  return L ? L : R;  // either one of p,q is on one side OR p,q is not in L&R subtrees
}

int sum=0;
int nodes=0;
int sum(Node root) {
    if(root == null) {
        return 0;
    }
    else {
        sum = sum + root.data
        nodes = nodes +1
        sum(root.left)
        sum(root.right)
    }
    print sum/nodes;
}




