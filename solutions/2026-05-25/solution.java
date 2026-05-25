// Container With Most Water
// Difficulty: Hard
// URL: https://leetcode.com/problems/container-with-most-water/

public int maxArea(int[] height) {
  int left = 0;
  int right = height.length - 1;
  int maxArea = 0;
  while (left < right) {
    int h = Math.min(height[left], height[right]);
    int w = right - left;
    maxArea = Math.max(maxArea, h * w);
    if (height[left] < height[right]) {
      left++;
    } else {
      right--;
    }
  }
  return maxArea;
}