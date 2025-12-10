# Container With Most Water

**ID:** 11  
**Difficulty:** Hard  
**URL:** https://leetcode.com/problems/container-with-most-water/  

## Explanation

This problem can be solved using a two-pointer approach. We initialize two pointers, one at the beginning and one at the end of the array. The area of the container is calculated as the minimum height of the two lines multiplied by the distance between them. We move the pointer of the shorter line towards the other pointer to maximize the area. This process continues until the two pointers meet.