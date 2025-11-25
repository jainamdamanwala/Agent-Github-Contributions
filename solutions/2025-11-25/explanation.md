# Container With Most Water

**ID:** 11  
**Difficulty:** Medium  
**URL:** https://leetcode.com/problems/container-with-most-water/  

## Explanation

This problem can be solved using a two-pointer approach. We start with two pointers, one at the beginning and one at the end of the array. We calculate the area of water that can be formed by the lines at the current positions of the two pointers. We update the maximum area if the current area is larger. We then move the pointer of the shorter line towards the other pointer, because the area of water is determined by the shorter line.