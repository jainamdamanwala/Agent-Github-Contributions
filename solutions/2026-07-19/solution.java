// Maximum Subarray
// Difficulty: Medium
// URL: https://leetcode.com/problems/maximum-subarray/

public int maxSubArray(int[] nums) {
  if (nums == null || nums.length == 0) return 0;
  int max_sum = Integer.MIN_VALUE;
  int current_sum = 0;
  for (int num : nums) {
    current_sum = Math.max(num, current_sum + num);
    max_sum = Math.max(max_sum, current_sum);
  }
  return max_sum;
}