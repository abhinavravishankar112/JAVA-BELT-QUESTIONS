#https://leetcode.com/problems/subsets/description/?envType=problem-list-v2&envId=backtracking
class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        res = []
        subset = []

        def backtrack(i):
            if i == len(nums):
                res.append(subset.copy())
                return
            
            subset.append(nums[i])
            backtrack(i+1)

            subset.pop()
            backtrack(i+1)

        backtrack(0)
        return res
#Time Complexity = O(n × 2ⁿ)
#Space Complexity = O(n × 2ⁿ)