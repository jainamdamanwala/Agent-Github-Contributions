# Container With Most Water
# Difficulty: Hard
# URL: https://leetcode.com/problems/container-with-most-water/

def maxSubarrays(nums): 
  n = len(nums)
  max_count = 0
  left = 0
  curr_sum = 0
  for right in range(n):
    curr_sum += nums[right]
    while curr_sum < 0 and left <= right:
      curr_sum -= nums[left]
      left += 1
    max_count = max(max_count, right - left + 1)
  return max_count