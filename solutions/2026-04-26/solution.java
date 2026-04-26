// Maximum Subarray
// Difficulty: Medium
// URL: https://leetcode.com/problems/maximum-subarray/

public int maxSubArray(int[] nums) {
    if (nums == null || nums.length == 0) {
        return 0;
    }
    int max_sum = Integer.MIN_VALUE;
    int cur_sum = 0;
    for (int num : nums) {
        cur_sum = Math.max(num, cur_sum + num);
        max_sum = Math.max(max_sum, cur_sum);
    }
    return max_sum;
}