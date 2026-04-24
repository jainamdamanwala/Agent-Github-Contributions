# Container With Most Water

**ID:** 11  
**Difficulty:** Hard  
**URL:** https://leetcode.com/problems/container-with-most-water/  

## Explanation

This problem can be solved by using a two-pointer technique. We start with two pointers at both ends of the array and move them towards each other. At each step, we calculate the area of the container that can be formed by the two lines and update the maximum area if necessary. We move the pointer that corresponds to the shorter line, because moving the pointer of the taller line will not increase the area.