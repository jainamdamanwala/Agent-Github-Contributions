# Container With Most Water

**ID:** 11  
**Difficulty:** Medium  
**URL:** https://leetcode.com/problems/container-with-most-water/  

## Explanation

The idea is to use two pointers, one at the beginning and one at the end of the array. The area of water between the two lines is calculated as the minimum height between the two lines multiplied by the distance between the two lines. The pointers are moved based on which line is shorter, as moving the shorter line will increase the area of water.