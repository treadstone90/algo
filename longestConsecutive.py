class Solution:
    def longestConsecutive(self,array):
        cache = {}

        for num in array:
            if num not in cache:
                num[cache] = 
