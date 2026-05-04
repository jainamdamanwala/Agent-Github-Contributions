# Container With Most Water

**ID:** 11  
**Difficulty:** Hard  
**URL:** https://leetcode.com/problems/container-with-most-water/  

## Explanation

The algorithm works by maintaining two pointers, one at the beginning and one at the end of the array. The area between the two lines is calculated as the minimum height of the two lines multiplied by the distance between them. The maximum area is updated if the current area is larger. The pointer of the shorter line is moved towards the other pointer to increase the area.