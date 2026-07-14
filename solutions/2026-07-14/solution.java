// Maximum Subarray Sum
// Difficulty: Medium
// URL: https://leetcode.com/problems/maximum-subarray-sum/

class Solution {
    public int maximumSum(int[] nums) {
        if (nums.length < 3) return -Integer.MAX_VALUE;
        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length - 2; i++) {
            max_sum = Math.max(max_sum, nums[i] + nums[i+1] + nums[i+2]);
        }
        return max_sum;
    }
}