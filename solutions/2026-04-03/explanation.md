# Container With Most Water

**ID:** 11  
**Difficulty:** Medium  
**URL:** https://leetcode.com/problems/container-with-most-water/  

## Explanation

This problem can be solved using a two-pointer technique. We start by initializing two pointers, one at the beginning and one at the end of the array. We then calculate the area of the container formed by the two lines and the x-axis, and update the maximum area if necessary. We then move the pointer that corresponds to the shorter line towards the other pointer, because moving the pointer that corresponds to the taller line will not increase the area. We repeat this process until the two pointers meet, at which point we return the maximum area.