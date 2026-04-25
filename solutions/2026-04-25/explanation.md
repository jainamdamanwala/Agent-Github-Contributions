# Container With Most Water

**ID:** 11  
**Difficulty:** Medium  
**URL:** https://leetcode.com/problems/container-with-most-water/  

## Explanation

The idea is to use two pointers, one at the beginning and one at the end of the array. The area of water between the two lines is calculated as the minimum height of the two lines times the distance between them. The maximum area is updated whenever a larger area is found. The pointers are moved towards each other based on which line has a smaller height, because the area is determined by the shorter line.