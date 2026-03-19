# Longest Increasing Subsequence
# Difficulty: Medium
# URL: https://leetcode.com/problems/longest-increasing-subsequence/

def lengthOfLIS(nums):\n    if not nums: return 0\n    dp = [1] * len(nums)\n    for i in range(1, len(nums)):\n        for j in range(i):\n            if nums[i] > nums[j]:\n                dp[i] = max(dp[i], dp[j] + 1)\n    return max(dp)\n