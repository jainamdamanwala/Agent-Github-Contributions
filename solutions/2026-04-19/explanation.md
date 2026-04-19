# Maximum Subarray Sum

**ID:** 53  
**Difficulty:** Medium  
**URL:** https://leetcode.com/problems/maximum-subarray/  

## Explanation

The problem can be solved using dynamic programming. We initialize an array dp of the same length as the input array nums. dp[i] represents the maximum sum of the subarray ending at index i. We then iterate over the array, updating dp[i] to be the maximum of the current element and the sum of the previous element and the current element. The maximum sum is then the maximum value in the dp array.