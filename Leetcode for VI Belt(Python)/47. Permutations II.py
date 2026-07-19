#https://leetcode.com/problems/permutations-ii/?envType=problem-list-v2&envId=backtracking
class Solution:
    def permuteUnique(self, nums: List[int]) -> List[List[int]]:
        res = set()
        def backtrack(start):
            if start == len(nums):
                res.add(tuple(nums))
                return
            
            for i in range(start, len(nums)):
                nums[start], nums[i] = nums[i] , nums[start]
                backtrack(start + 1)
                nums[start], nums[i] = nums[i] , nums[start]

        backtrack(0)
        return [list(p) for p in res]