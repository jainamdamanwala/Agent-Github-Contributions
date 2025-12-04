# Container With Most Water

**ID:** 11  
**Difficulty:** Medium  
**URL:** https://leetcode.com/problems/container-with-most-water/  

## Explanation

The two-pointer technique is used to solve this problem. We initialize two pointers, one at the start and one at the end of the array. We calculate the area between the two lines and update the maximum area if necessary. We then move the pointer of the shorter line towards the other pointer, because the area between the two lines is limited by the shorter line.