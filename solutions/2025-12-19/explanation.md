# Container With Most Water

**ID:** 11  
**Difficulty:** Hard  
**URL:** https://leetcode.com/problems/container-with-most-water/  

## Explanation

The idea is to use a two-pointer approach. We start with two pointers, one at the beginning and one at the end of the array. We calculate the area between the two lines and update the maximum area if necessary. We then move the pointer of the shorter line towards the other pointer, because the area is determined by the shorter line. This way, we ensure that we are always considering the maximum possible area.