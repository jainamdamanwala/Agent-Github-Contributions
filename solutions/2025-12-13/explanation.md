# Median of Two Sorted Arrays

**ID:** 4  
**Difficulty:** Hard  
**URL:** https://leetcode.com/problems/median-of-two-sorted-arrays/  

## Explanation

The idea is to use binary search to find the partition point for the two arrays. We want to find the partition point such that the elements on the left side of the partition point in both arrays are smaller than the elements on the right side. The time complexity is O(log(min(m, n))) because we are doing binary search on the smaller array.