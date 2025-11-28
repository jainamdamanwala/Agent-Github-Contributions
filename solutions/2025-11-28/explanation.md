# Container With Most Water

**ID:** 11  
**Difficulty:** Hard  
**URL:** https://leetcode.com/problems/container-with-most-water/  

## Explanation

This problem can be solved using a two-pointer technique. We start with two pointers at the beginning and end of the array, and move them towards each other. At each step, we calculate the area of the container that can be formed by the two lines and update the maximum area if necessary. We move the pointer that points to the shorter line towards the other pointer, because the area is determined by the shorter line.