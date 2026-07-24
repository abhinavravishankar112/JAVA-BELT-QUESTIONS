#https://leetcode.com/problems/max-number-of-k-sum-pairs/?envType=problem-list-v2&envId=dus27apc
class Solution:
    def maxOperations(self, nums: List[int], k: int) -> int:
        nums.sort()
        
        l = 0
        r = len(nums) - 1

        ans = 0

        while l < r:
            s = nums[l] + nums[r]
            if s == k:
                ans += 1
                l += 1
                r -= 1
            elif s < k:
                l += 1
            else:
                r -= 1
        return ans
#time complexity: O(nlogn) - sorting
#space complexity: O(1) - two pointers