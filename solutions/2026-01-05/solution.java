// Maximum Subarray
// Difficulty: Medium
// URL: https://leetcode.com/problems/maximum-subarray/

public int maxSubArray(int[] nums) {
    if (nums.length == 0) return 0;
    int maxSum = Integer.MIN_VALUE;
    int currentSum = 0;
    for (int num : nums) {
        currentSum = Math.max(num, currentSum + num);
        maxSum = Math.max(maxSum, currentSum);
    }
    return maxSum;
}