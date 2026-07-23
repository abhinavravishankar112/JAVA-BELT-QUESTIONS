#https://leetcode.com/problems/path-with-maximum-gold/description/?envType=problem-list-v2&envId=dus27apc
class Solution:
    def getMaximumGold(self, grid: List[List[int]]) -> int:
        rows = len(grid)
        cols = len(grid[0])

        def dfs(r, c):
            if r < 0 or c < 0 or r == rows or c == cols or grid[r][c] == 0:
                return 0
            
            gold = grid[r][c]
            grid[r][c] = 0

            best = max(
                dfs(r+1, c),
                dfs(r-1, c),
                dfs(r, c+1),
                dfs(r, c-1)
            )
            grid[r][c] = gold
            return gold + best

        ans = 0
        for r in range(rows):
            for c in range(cols):
                ans = max(ans, dfs(r, c))
        return ans
#Time Complexity: O(k × 3ᵏ)
#Space Complexity: O(k)