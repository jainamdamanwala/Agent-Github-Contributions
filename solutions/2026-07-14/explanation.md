# Maximum Subarray Sum

**ID:** 53  
**Difficulty:** Medium  
**URL:** https://leetcode.com/problems/maximum-subarray-sum/  

## Explanation

This problem can be solved by iterating over the array and keeping track of the maximum sum of a subarray of size 3. The maximum sum is updated at each step to be the maximum of the current maximum sum and the sum of the current element and the next two elements.