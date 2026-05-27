# Container With Most Water

**ID:** 11  
**Difficulty:** Medium  
**URL:** https://leetcode.com/problems/container-with-most-water/  

## Explanation

This problem can be solved using a two-pointer technique. We start by initializing two pointers, one at the beginning of the array and one at the end. We then calculate the area of water that can be formed by the two lines and update our maximum area if necessary. We move the pointer that corresponds to the shorter line towards the other pointer, because the area of water is determined by the height of the shorter line. This way, we ensure that we are always considering the maximum possible area.