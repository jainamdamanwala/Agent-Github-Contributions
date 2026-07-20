# Search Insert Position

**ID:** 35  
**Difficulty:** Easy  
**URL:** https://leetcode.com/problems/search-insert-position/  

## Explanation

This problem can be solved by using the built-in binary search function in Python (bisect_left) or Java (Arrays.binarySearch). If the target is found, the index is returned. If not, the index where it will be if it were inserted in order is calculated by taking the absolute value of the index and subtracting 1.