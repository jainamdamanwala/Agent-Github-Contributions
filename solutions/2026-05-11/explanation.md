# Container With Most Water

**ID:** 11  
**Difficulty:** Hard  
**URL:** https://leetcode.com/problems/container-with-most-water/  

## Explanation

This problem can be solved by using a two-pointer technique. We start with two pointers at the beginning and the end of the array. The area of the container is calculated as the minimum height of the two lines and the distance between them. We move the pointer of the shorter line towards the other pointer to maximize the area.