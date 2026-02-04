# Maximum Subarray
# Difficulty: Medium
# URL: https://leetcode.com/problems/maximum-subarray/

def maxSubArray(nums):\n    if not nums: return 0\n    dp = [0] * len(nums)\n    dp[0] = nums[0]\n    max_sum = nums[0]\n    for i in range(1, len(nums)):\n        dp[i] = max(nums[i], dp[i-1] + nums[i])\n        max_sum = max(max_sum, dp[i])\n    return max_sum