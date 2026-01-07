# Container With Most Water

**ID:** 11  
**Difficulty:** Medium  
**URL:** https://leetcode.com/problems/container-with-most-water/  

## Explanation

This problem can be solved using a two-pointer technique. We start with two pointers, one at the beginning and one at the end of the array. We calculate the area of water that can be contained between the two lines at the current positions. We then move the pointer of the shorter line towards the other pointer. This is because the area of water is limited by the shorter line, so moving the shorter line will not decrease the area of water. We repeat this process until the two pointers meet, and the maximum area of water is returned.