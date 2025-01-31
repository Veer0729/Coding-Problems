# https://www.geeksforgeeks.org/problems/count-pairs-whose-sum-is-less-than-target/1
# Algo used: Two Pointer Method

class Solution:
    def countPairs(self, arr, target):
        count = 0 # initial count
        arr.sort() 
        s = 0 # first of the array
        end = len(arr) - 1 # last of the array
        
        while s < end: # until our start reaches the end
            if arr[s] + arr[end] < target: # should be less than the target
                count += (end - s) 
                s += 1
            else:
                end -= 1 
        return count
