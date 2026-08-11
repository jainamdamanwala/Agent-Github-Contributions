# Container With Most Water

**ID:** 11  
**Difficulty:** Hard  
**URL:** https://leetcode.com/problems/container-with-most-water/  

## Explanation

This problem can be solved using a two-pointer approach. We start with two pointers at both ends of the array and calculate the area of the container formed by the two lines and the x-axis. We then move the pointer of the shorter line towards the other pointer to maximize the area. This process continues until the two pointers meet.