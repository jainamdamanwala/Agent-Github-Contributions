# Container With Most Water

**ID:** 11  
**Difficulty:** Hard  
**URL:** https://leetcode.com/problems/container-with-most-water/  

## Explanation

This problem can be solved using a two-pointer technique. We start with two pointers at the beginning and end of the array. We calculate the area of water that can be formed by the two lines and update the maximum area if necessary. We then move the pointer of the shorter line towards the other pointer. This is because the area of water is determined by the height of the shorter line, so moving the pointer of the shorter line will not decrease the area of water.