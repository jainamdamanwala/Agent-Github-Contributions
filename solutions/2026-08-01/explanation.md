# Container With Most Water

**ID:** 11  
**Difficulty:** Medium  
**URL:** https://leetcode.com/problems/container-with-most-water/  

## Explanation

This problem is a classic example of a two-pointer technique. We start by initializing two pointers, one at the beginning and one at the end of the array. We then calculate the area of the water that can be trapped between the two lines and update our maximum area if necessary. We move the pointer of the shorter line towards the other pointer, because the area of the water that can be trapped is determined by the shorter line.