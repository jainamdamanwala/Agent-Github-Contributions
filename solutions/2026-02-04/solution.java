// Maximum Subarray
// Difficulty: Medium
// URL: https://leetcode.com/problems/maximum-subarray/

public int maxSubArray(int[] nums) {\n    if (nums.length == 0) return 0;\n    int[] dp = new int[nums.length];\n    dp[0] = nums[0];\n    int max_sum = nums[0];\n    for (int i = 1; i < nums.length; i++) {\n        dp[i] = Math.max(nums[i], dp[i-1] + nums[i]);\n        max_sum = Math.max(max_sum, dp[i]);\n    }\n    return max_sum;\n}