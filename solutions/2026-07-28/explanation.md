# First Missing Positive

**ID:** 41  
**Difficulty:** Medium  
**URL:** https://leetcode.com/problems/first-missing-positive/  

## Explanation

This problem can be solved by first rearranging the array such that the value at index i is equal to i + 1 if possible. Then we can simply iterate through the array to find the first missing positive integer.