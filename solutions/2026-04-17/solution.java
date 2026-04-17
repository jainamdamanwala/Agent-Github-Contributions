// Container With Most Water
// Difficulty: Hard
// URL: https://leetcode.com/problems/container-with-most-water/

class Solution {
    public int[] maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        int[] result = new int[2];

        while (left < right) {
            int area = (right - left) * Math.min(height[left], height[right]);
            if (area > maxArea) {
                maxArea = area;
                result[0] = left;
                result[1] = right;
            }
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return result;
    }
}