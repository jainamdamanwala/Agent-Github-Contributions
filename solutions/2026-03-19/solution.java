// Longest Increasing Subsequence
// Difficulty: Medium
// URL: https://leetcode.com/problems/longest-increasing-subsequence/

class Solution {\n    public int lengthOfLIS(int[] nums) {\n        if (nums == null || nums.length == 0) return 0;\n        int[] dp = new int[nums.length];\n        for (int i = 1; i < nums.length; i++) {\n            for (int j = 0; j < i; j++) {\n                if (nums[i] > nums[j]) {\n                    dp[i] = Math.max(dp[i], dp[j] + 1);\n                }\n            }\n        }\n        int max = dp[0];\n        for (int i = 1; i < dp.length; i++) {\n            max = Math.max(max, dp[i]);\n        }\n        return max;\n    }\n}