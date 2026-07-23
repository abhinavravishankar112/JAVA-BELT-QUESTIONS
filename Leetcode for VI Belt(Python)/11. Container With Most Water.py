#https://leetcode.com/problems/container-with-most-water/description/?envType=problem-list-v2&envId=dus27apc
class Solution:
    def maxArea(self, height: List[int]) -> int:
        l = 0
        r = len(height) - 1
        ans = 0
        
        while l < r:
            ans = max(ans, min(height[l], height[r]) * (r - l))

            if height[l] < height[r]:
                l += 1
            else:
                r -= 1
        return ans
# Time Complexity = O(n)
# Space Complexity = O(1)