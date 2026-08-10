# Container With Most Water

**ID:** 11  
**Difficulty:** Hard  
**URL:** https://leetcode.com/problems/container-with-most-water/  

## Explanation

This problem can be solved by using a two-pointer approach. We start with two pointers, one at the beginning and one at the end of the array. We calculate the area of water that can be formed by the line at the left pointer and the line at the right pointer. We then move the pointer of the shorter line towards the other pointer, because the area of water is determined by the height of the shorter line. We repeat this process until the two pointers meet.