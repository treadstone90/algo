from collections import defaultdict
from collections import deque


class Solution:
    def ladderLength(self, start, end, dict_):
        
        BFS_queue = deque()
        graph_explore = deque()

        for word in dict_:
            graph_explore.append(word)

        graph_explore.append(start)
        graph_explore.append(end)

        BFS_queue.append(start)
        visited = defaultdict(bool)

        edgeTo = {} 
        edgeTo[start] = ""

        success = False

        while len(BFS_queue)  != 0:
            node = BFS_queue.popleft()

            if node == end:
                success = True
                break
            limit = len(graph_explore)
            i = 0

            while i < limit:
                word = graph_explore.popleft()
                if word == node:
                    i +=1 
                    continue

                elif self.isDistOne(word, node) == True:
                    visited[word] = True
                    edgeTo[word] = node
                    BFS_queue.append(word)
                else:
                    graph_explore.append(word)

                i += 1


        if success == False:
            return 0
        else:
            result = []
            w = end
            while w != "":
                result.append(w)
                w = edgeTo[w]

            return result


    def isDistOne(self,w1,w2):
        if len(w1) != len(w2):
            return False
        else:
            count = 0
            for index in range(len(w1)):
                if w1[index] != w2[index]:
                    count += 1
                else:
                    pass

                if count > 1:
                    return False
            return True





def main():
    s = Solution()
    print s.ladderLength("hit","cog",["hot","dot","dog","lot","log"])
    print s.ladderLength("hit","dop",["hot","dot","dog","lot","log"])
    print s.ladderLength("hit","hoh",["hot","dot","dog","lot","log"])
    print s.ladderLength("hit","dzt",["hot","dot","dog","lot","log"])
    print s.ladderLength("a","c",["a","b","c"])
if __name__ == '__main__':
    main()