# Container With Most Water
# Difficulty: Hard
# URL: https://leetcode.com/problems/container-with-most-water/

def findMidpoint(nums, n):
    if n == 0 or n == 1:
        return None
    target = (n + 1) // 2
    left, right = 0, n - 1
    while left <= right:
        current_sum = nums[left] + nums[right]
        if current_sum == target:
            return [left + 1, right + 1]
        elif current_sum < target:
            left += 1
        else:
            right -= 1
    return None