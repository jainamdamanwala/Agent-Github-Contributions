# Container With Most Water

**ID:** 11  
**Difficulty:** Hard  
**URL:** https://leetcode.com/problems/container-with-most-water/  

## Explanation

The problem can be solved using a two-pointer approach. We start with two pointers, one at the beginning and one at the end of the array. We calculate the area of the container that can be formed with the current two lines. We then move the pointer of the shorter line towards the other pointer. This is because the area of the container is limited by the height of the shorter line. We repeat this process until the two pointers meet, and return the maximum area found.