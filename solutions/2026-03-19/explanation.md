# Longest Increasing Subsequence

**ID:** 300  
**Difficulty:** Medium  
**URL:** https://leetcode.com/problems/longest-increasing-subsequence/  

## Explanation

This problem can be solved using dynamic programming. We create a dynamic programming array dp where dp[i] represents the length of the longest increasing subsequence ending at index i. We then iterate through the array and for each element, we check all previous elements. If the current element is greater than the previous element, we update dp[i] to be the maximum of its current value and dp[j] + 1, where j is the index of the previous element. Finally, we return the maximum value in the dp array, which represents the length of the longest increasing subsequence.