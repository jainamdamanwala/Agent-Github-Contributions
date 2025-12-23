# Container With Most Water

**ID:** 11  
**Difficulty:** Medium  
**URL:** https://leetcode.com/problems/container-with-most-water/  

## Explanation

The idea is to use two pointers, one at the start and one at the end of the array, and move them towards each other. At each step, we calculate the area of the container that can be formed by the two lines and update the maximum area if necessary. We move the pointer that corresponds to the shorter line towards the other pointer because the area is determined by the height of the shorter line.