# Container With Most Water

**ID:** 11  
**Difficulty:** Hard  
**URL:** https://leetcode.com/problems/container-with-most-water/  

## Explanation

This problem can be solved using a sliding window approach. We maintain a left pointer and a right pointer. The right pointer moves to the right and the sum of the elements in the window is calculated. If the sum is less than 0, we move the left pointer to the right until the sum is greater than or equal to 0. The maximum count of non-empty non-overlapping subarrays is updated at each step.