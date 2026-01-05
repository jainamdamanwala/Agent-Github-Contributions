# Maximum Subarray

**ID:** 53  
**Difficulty:** Medium  
**URL:** https://leetcode.com/problems/maximum-subarray/  

## Explanation

This problem can be solved using Kadane's algorithm, which iterates through the array and at each step, it decides whether to continue the current subarray or start a new one. The maximum sum of a subarray ending at the current position is the maximum of the current number and the sum of the current number and the previous maximum sum.