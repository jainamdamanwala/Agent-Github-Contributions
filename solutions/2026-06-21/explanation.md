# Container With Most Water

**ID:** 11  
**Difficulty:** Medium  
**URL:** https://leetcode.com/problems/container-with-most-water/  

## Explanation

This problem can be solved by using a two-pointer technique. We initialize two pointers, one at the beginning and one at the end of the array. We calculate the area of water that can be trapped between the two lines and update the maximum area if necessary. We then move the pointer that corresponds to the shorter line towards the other pointer. This is because the area of water that can be trapped is determined by the shorter line, so moving the shorter line towards the other pointer will not decrease the area of water that can be trapped.