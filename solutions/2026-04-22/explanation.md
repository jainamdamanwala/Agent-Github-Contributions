# Container With Most Water

**ID:** 11  
**Difficulty:** Hard  
**URL:** https://leetcode.com/problems/container-with-most-water/  

## Explanation

This problem can be solved by using a two-pointer approach. We start with two pointers at the beginning and end of the array, and move them towards each other. At each step, we calculate the area between the two lines and update the maximum area if necessary. We move the pointer of the shorter line towards the other pointer, because moving the pointer of the taller line will not increase the area.