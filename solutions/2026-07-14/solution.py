# Maximum Subarray Sum
# Difficulty: Medium
# URL: https://leetcode.com/problems/maximum-subarray-sum/

def maximumSum(nums):
    if len(nums) < 3:
        return -float('inf')
    max_sum = float('-inf')
    for i in range(len(nums) - 2):
        max_sum = max(max_sum, nums[i] + nums[i+1] + nums[i+2])
    return max_sum