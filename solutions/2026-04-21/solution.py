# First Missing Positive
# Difficulty: Medium
# URL: https://leetcode.com/problems/first-missing-positive/

class Solution:
    def firstMissingPositive(self, nums: List[int]) -> int:
        if not nums:
            return 1
        n = len(nums)
        nums = set(nums)
        for i in range(1, n + 2):
            if i not in nums:
                return i
        return n + 1