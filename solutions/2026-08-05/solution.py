# Container With Most Water
# Difficulty: Medium
# URL: https://leetcode.com/problems/container-with-most-water/

def maxArea(height):
    max_water = 0
    left = 0
    right = len(height) - 1
    while left < right:
        width = right - left
        height_min = min(height[left], height[right])
        area = width * height_min
        max_water = max(max_water, area)
        if height[left] < height[right]:
            left += 1
        else:
            right -= 1
    return max_water