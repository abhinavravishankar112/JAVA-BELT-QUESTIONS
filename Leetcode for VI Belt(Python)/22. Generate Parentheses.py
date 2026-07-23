# https://leetcode.com/problems/generate-parentheses/description/?envType=problem-list-v2&envId=backtracking
class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        res = []
        def backtrack(s, open, closed):
            if open == closed == n:
                res.append(s)
                return
            
            if open < n:
                backtrack(s + "(", open + 1, closed)
            
            if closed < open:
                backtrack(s + ")", open, closed+1)
        
        backtrack("", 0, 0)
        return res
#time complexity: O(Cₙ × n) - Catalan number
#space complexity: O(n) - recursion stack