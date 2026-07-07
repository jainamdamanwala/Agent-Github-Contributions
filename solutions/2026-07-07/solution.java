// Container With Most Water
// Difficulty: Hard
// URL: https://leetcode.com/problems/container-with-most-water/

public int maxArea(int[] height) {
  int left = 0, right = height.length - 1, maxArea = 0;
  while (left < right) {
    int minHeight = Math.min(height[left], height[right]);
    maxArea = Math.max(maxArea, minHeight * (right - left));
    if (height[left] < height[right]) {
      left++;
    } else {
      right--;
    }
  }
  return maxArea;
}