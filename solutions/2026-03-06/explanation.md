# Container With Most Water

**ID:** 11  
**Difficulty:** Hard  
**URL:** https://leetcode.com/problems/container-with-most-water/  

## Explanation

The two-pointer technique is used to solve this problem. We start by initializing two pointers, one at the beginning and one at the end of the array. We then calculate the area of the container that can be formed by the two lines and update the maximum area if necessary. We move the pointer that corresponds to the shorter line towards the other pointer, because the area of the container is determined by the height of the shorter line.