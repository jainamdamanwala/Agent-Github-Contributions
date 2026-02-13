# Container With Most Water
# Difficulty: Hard
# URL: https://leetcode.com/problems/container-with-most-water/

def maxArea(height): 
  max_area = 0
  left = 0
  right = len(height) - 1
  while left < right:
    h = min(height[left], height[right])
    w = right - left
    max_area = max(max_area, h * w)
    if height[left] < height[right]:
      left += 1
    else:
      right -= 1
  return max_area