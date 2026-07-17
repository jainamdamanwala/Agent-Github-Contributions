# Container With Most Water

**ID:** 11  
**Difficulty:** Medium  
**URL:** https://leetcode.com/problems/container-with-most-water/  

## Explanation

The idea is to use two pointers, one at the start and one at the end of the array. The area of water between the two lines at each step is calculated as the minimum height of the two lines multiplied by the distance between them. The maximum area is updated at each step. The pointer that points to the shorter line is moved towards the other pointer to increase the area.