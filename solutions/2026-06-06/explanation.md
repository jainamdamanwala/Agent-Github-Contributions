# Container With Most Water

**ID:** 11  
**Difficulty:** Hard  
**URL:** https://leetcode.com/problems/container-with-most-water/  

## Explanation

This problem can be solved using a two-pointer approach. We start with two pointers, one at the beginning and one at the end of the array. We calculate the area between the two lines and update the maximum area if necessary. We then move the pointer of the shorter line towards the other pointer. This is because the area between two lines is determined by the shorter line, so moving the shorter line will not decrease the area. We repeat this process until the two pointers meet.