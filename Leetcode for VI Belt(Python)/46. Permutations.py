# https://leetcode.com/problems/permutations/description/?envType=problem-list-v2&envId=backtracking
class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        res = []
        perm = []
        visit = set()

        def backtrack():
            if len(perm) == len(nums):
                res.append(perm.copy())
                return

            for num in nums:
                if num not in visit:
                    perm.append(num)
                    visit.add(num)

                    backtrack()

                    perm.pop()
                    visit.remove(num)

        backtrack()
        return res

                