// Container With Most Water
// Difficulty: Medium
// URL: https://leetcode.com/problems/container-with-most-water/

public int maxArea(int[] height) {
    int max_water = 0;
    int left = 0;
    int right = height.length - 1;
    while (left < right) {
        int h = Math.min(height[left], height[right]);
        int w = right - left;
        max_water = Math.max(max_water, h * w);
        if (height[left] < height[right]) {
            left++;
        } else {
            right--;
        }
    }
    return max_water;
}