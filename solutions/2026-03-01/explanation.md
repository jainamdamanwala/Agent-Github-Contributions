# Container With Most Water

**ID:** 11  
**Difficulty:** Hard  
**URL:** https://leetcode.com/problems/container-with-most-water/  

## Explanation

This problem can be solved using a two-pointer approach. We initialize two pointers, one at the start and one at the end of the array. We calculate the area of water that can be trapped between the two lines and update the maximum area if necessary. We then move the pointer that corresponds to the shorter line towards the other pointer, because the area of water that can be trapped is limited by the shorter line. This process continues until the two pointers meet, at which point we return the maximum area.