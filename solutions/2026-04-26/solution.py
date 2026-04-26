# Maximum Subarray
# Difficulty: Medium
# URL: https://leetcode.com/problems/maximum-subarray/

def maxSubArray(nums):
    if not nums:
        return 0
    max_sum = float('-inf')
    cur_sum = 0
    for num in nums:
        cur_sum = max(num, cur_sum + num)
        max_sum = max(max_sum, cur_sum)
    return max_sum