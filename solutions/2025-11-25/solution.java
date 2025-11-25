// Container With Most Water
// Difficulty: Medium
// URL: https://leetcode.com/problems/container-with-most-water/

public int maxArea(int[] height) {
  int left = 0, right = height.length - 1, maxArea = 0;
  while (left < right) {
    int minH = Math.min(height[left], height[right]);
    maxArea = Math.max(maxArea, minH * (right - left));
    if (height[left] < height[right]) {
      left++;
    } else {
      right--;
    }
  }
  return maxArea;
}