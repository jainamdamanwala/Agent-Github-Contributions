# Container With Most Water

**ID:** 11  
**Difficulty:** Hard  
**URL:** https://leetcode.com/problems/container-with-most-water/  

## Explanation

This problem can be solved using a two-pointer technique. We start with two pointers, one at the beginning and one at the end of the height array. We calculate the area of the container that can be formed by the two lines at the current positions. We then move the pointer of the shorter line towards the other pointer, because the area is determined by the shorter line. We repeat this process until the two pointers meet, and the maximum area is the answer.