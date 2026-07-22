#https://leetcode.com/problems/partition-equal-subset-sum/description/?envType=problem-list-v2&envId=dus27apc
class Solution:
    def canPartition(self, nums: List[int]) -> bool:
        total = sum(nums)
        if total % 2 != 0:
            return False

        target = total // 2
        dp = {0}

        for num in nums:
            new = set(dp)

            for s in dp:
                if s + num == target:
                    return True
                new.add(s+num)

            dp = new
        return target in dp
            