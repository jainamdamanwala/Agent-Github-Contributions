# Container With Most Water

**ID:** 11  
**Difficulty:** Hard  
**URL:** https://leetcode.com/problems/container-with-most-water/  

## Explanation

This problem can be solved using a two-pointer technique. We start by initializing two pointers, one at the beginning and one at the end of the array. We then calculate the area of water that can be formed by the two lines at the current positions. We update the maximum area if the current area is larger. We then move the pointer that corresponds to the shorter line towards the other pointer, because the area of water is limited by the shorter line. This process continues until the two pointers meet.