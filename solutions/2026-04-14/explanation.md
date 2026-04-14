# Container With Most Water

**ID:** 11  
**Difficulty:** Hard  
**URL:** https://leetcode.com/problems/container-with-most-water/  

## Explanation

This problem can be solved using a two-pointer technique. We initialize two pointers, one at the start and one at the end of the array. The area between the two lines is calculated as the minimum height between the two lines multiplied by the distance between the two lines. We then move the pointer that corresponds to the shorter line towards the other pointer. This is because the area is determined by the height of the shorter line, so moving the other pointer will not increase the area. We repeat this process until the two pointers meet, and the maximum area is returned.