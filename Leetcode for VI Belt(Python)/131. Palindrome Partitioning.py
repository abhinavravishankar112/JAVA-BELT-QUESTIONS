#https://leetcode.com/problems/palindrome-partitioning/description/?envType=problem-list-v2&envId=backtracking
class Solution:
    def partition(self, s: str) -> List[List[str]]:
        res = []
        part = []

        def backtrack(start):
            if start == len(s):
                res.append(part.copy())
                return
            
            for end in range(start, len(s)):
                sub = s[start:end+1]
                if sub == sub[::-1]:
                    part.append(sub)
                    backtrack(end + 1)
                    part.pop()

        backtrack(0)
        return res