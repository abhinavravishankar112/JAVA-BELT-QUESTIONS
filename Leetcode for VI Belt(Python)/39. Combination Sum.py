#https://leetcode.com/problems/combination-sum/description/?envType=problem-list-v2&envId=backtracking
class Solution:
    def combinationSum(self, candidates: List[int], target: int) -> List[List[int]]:
        res = []
        curr = []

        def backtrack(i, total):
            if total == target:
                res.append(curr.copy())
                return
            
            if i >= len(candidates) or total > target:
                return
            
            curr.append(candidates[i])
            backtrack(i, total + candidates[i])
            curr.pop()

            backtrack(i + 1, total)
        
        backtrack(0, 0)
        return res
