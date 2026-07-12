# Container With Most Water

**ID:** 11  
**Difficulty:** Medium  
**URL:** https://leetcode.com/problems/container-with-most-water/  

## Explanation

This problem can be solved using a two-pointer technique. We start with two pointers, one at the beginning and one at the end of the array. We calculate the area of the water that can be formed by the two lines and update the maximum area if necessary. We then move the pointer that corresponds to the shorter line towards the other pointer, because the area of the water is determined by the height of the shorter line.