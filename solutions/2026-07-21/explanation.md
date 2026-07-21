# Container With Most Water

**ID:** 11  
**Difficulty:** Hard  
**URL:** https://leetcode.com/problems/container-with-most-water/  

## Explanation

This problem is not the same as the LeetCode problem 'Container With Most Water'. The given problem is asking to find two points in the array that sum up to the midpoint of the array. We use a two-pointer technique to solve this problem. We start with two pointers, one at the beginning and one at the end of the array. We then move the pointers based on the sum of the values at the pointers. If the sum is equal to the midpoint, we return the indices of the pointers. If the sum is less than the midpoint, we move the left pointer to the right. If the sum is greater than the midpoint, we move the right pointer to the left.