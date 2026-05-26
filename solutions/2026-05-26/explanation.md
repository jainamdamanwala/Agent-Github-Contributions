# Container With Most Water

**ID:** 11  
**Difficulty:** Medium  
**URL:** https://leetcode.com/problems/container-with-most-water/  

## Explanation

The idea is to maintain two pointers, one at the beginning and one at the end of the array. The area between the two lines is calculated as the minimum height between the two lines multiplied by the distance between them. The maximum area is updated whenever a larger area is found. The pointers are moved towards each other based on the height of the lines. If the height of the left line is less than the height of the right line, the left pointer is moved to the right. Otherwise, the right pointer is moved to the left.