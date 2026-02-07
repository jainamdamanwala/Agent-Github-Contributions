# Container With Most Water

**ID:** 11  
**Difficulty:** Medium  
**URL:** https://leetcode.com/problems/container-with-most-water/  

## Explanation

The idea is to use two pointers, one at the beginning and one at the end of the array. The area between the two lines is calculated as the minimum height between the two lines multiplied by the distance between them. The maximum area is updated whenever a larger area is found. The pointer of the shorter line is moved towards the other pointer to increase the area.