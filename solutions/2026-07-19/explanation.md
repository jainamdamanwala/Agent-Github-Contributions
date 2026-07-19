# Maximum Subarray

**ID:** 53  
**Difficulty:** Medium  
**URL:** https://leetcode.com/problems/maximum-subarray/  

## Explanation

This problem can be solved using Kadane's algorithm, which is a linear-time algorithm for finding the maximum sum of a contiguous subarray within a one-dimensional array of numbers.
The idea is to keep track of the maximum sum of the subarray ending at the current position and the maximum sum of the subarray seen so far.
At each position, we update the maximum sum of the subarray ending at the current position to be the maximum of the current number and the sum of the current number and the previous maximum sum.
We also update the maximum sum of the subarray seen so far to be the maximum of the current maximum sum and the maximum sum of the subarray ending at the current position.