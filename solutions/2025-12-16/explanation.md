# Container With Most Water

**ID:** 11  
**Difficulty:** hard  
**URL:** https://leetcode.com/problems/container-with-most-water/  

## Explanation

This problem can be solved using a two-pointer technique. We initialize two pointers, one at the beginning and one at the end of the array. We then calculate the area of water that can be formed by the two lines and update the maximum area if necessary. We move the pointer of the shorter line towards the other pointer to maximize the area. This process continues until the two pointers meet.