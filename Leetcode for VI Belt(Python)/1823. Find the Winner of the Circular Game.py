#https://leetcode.com/problems/find-the-winner-of-the-circular-game/description/?envType=problem-list-v2&envId=dus27apc
class Solution:
    def findTheWinner(self, n: int, k: int) -> int:
        people = list(range(1,n+1))
        i = 0

        while(len(people) > 1):
            i = (i + k - 1) % len(people)
            people.pop(i)
            
        return people[0]
#Time Complexity = O(n^2)
#Space Complexity = O(n)