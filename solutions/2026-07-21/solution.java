// Container With Most Water
// Difficulty: Hard
// URL: https://leetcode.com/problems/container-with-most-water/

public class Solution {
    public int[] findMidpoint(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return null;
        }
        int target = (nums.length + 1) / 2;
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int currentSum = nums[left] + nums[right];
            if (currentSum == target) {
                return new int[] {left + 1, right + 1};
            } else if (currentSum < target) {
                left++;
            } else {
                right--;
            }
        }
        return null;
    }
}