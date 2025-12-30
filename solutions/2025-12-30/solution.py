# Maximum Subarray
# Difficulty: Medium
# URL: https://leetcode.com/problems/maximum-subarray/

def maxSubArray(nums): 
  if not nums: return 0
  dp = [0]*len(nums)
  dp[0] = nums[0]
  for i in range(1, len(nums)):
    dp[i] = max(dp[i-1] + nums[i], nums[i])
  return max(dp)