# Container With Most Water

**ID:** 11  
**Difficulty:** Hard  
**URL:** https://leetcode.com/problems/container-with-most-water/  

## Explanation

This problem can be solved using a two-pointer approach. We start with two pointers, one at the beginning and one at the end of the array. We calculate the area of water that can be formed by the two lines and update the maximum area if necessary. We then move the pointer that points to the shorter line towards the other pointer. This is because the area of water is limited by the shorter line, so moving the pointer towards the other pointer will not decrease the area of water. We repeat this process until the two pointers meet.