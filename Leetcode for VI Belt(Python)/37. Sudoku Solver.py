#https://leetcode.com/problems/sudoku-solver/description/?envType=problem-list-v2&envId=backtracking
class Solution:
    def solveSudoku(self, board: List[List[str]]) -> None:
        cols = collections.defaultdict(set)
        rows = collections.defaultdict(set)
        squares = collections.defaultdict(set)

        for r in range(9):
            for c in range(9):
                if board[r][c] == ".":
                    continue
                cols[c].add(board[r][c])
                rows[r].add(board[r][c])
                squares[(r // 3, c // 3)].add(board[r][c])

        def backtrack(r, c):
            if r == 9:
                return True

            if c == 9:
                return backtrack(r + 1, 0)

            if board[r][c] != ".":
                return backtrack(r, c + 1)

            for num in map(str, range(1, 10)):
                if (num in rows[r] or
                    num in cols[c] or
                    num in squares[(r // 3, c // 3)]):
                    continue

                board[r][c] = num
                rows[r].add(num)
                cols[c].add(num)
                squares[(r // 3, c // 3)].add(num)

                if backtrack(r, c + 1):
                    return True

                board[r][c] = "."
                rows[r].remove(num)
                cols[c].remove(num)
                squares[(r // 3, c // 3)].remove(num)

            return False

        backtrack(0, 0)