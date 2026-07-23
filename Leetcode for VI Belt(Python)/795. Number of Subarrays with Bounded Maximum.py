#https://leetcode.com/problems/number-of-subarrays-with-bounded-maximum/?envType=problem-list-v2&envId=dus27apc
class Solution:
    def numSubarrayBoundedMax(self, nums: List[int], left: int, right: int) -> int:
        def count(bound):
            ans = 0
            length = 0

            for num in nums:
                if num <= bound:
                    length += 1
                else:
                    length = 0
                
                ans += length
            return ans
        return count(right) - count(left - 1)