// Container With Most Water
// Difficulty: Hard
// URL: https://leetcode.com/problems/container-with-most-water/

public int maxArea(int[] height) {
  int max_water = 0;
  int left = 0;
  int right = height.length - 1;
  while (left < right) {
    int width = right - left;
    int area = width * Math.min(height[left], height[right]);
    max_water = Math.max(max_water, area);
    if (height[left] < height[right]) {
      left++;
    } else {
      right--;
    }
  }
  return max_water;
}