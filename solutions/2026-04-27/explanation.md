# Container With Most Water

**ID:** 11  
**Difficulty:** Hard  
**URL:** https://leetcode.com/problems/container-with-most-water/  

## Explanation

This problem can be solved using a two-pointer technique. We start with two pointers, one at the beginning and one at the end of the array. The area of the container is calculated as the minimum height of the two lines times the distance between them. We then move the pointer of the shorter line towards the other pointer. This is because moving the pointer of the shorter line will not decrease the area, as the height of the shorter line is the limiting factor. We repeat this process until the two pointers meet, and the maximum area is returned.