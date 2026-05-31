# Container With Most Water

**ID:** 11  
**Difficulty:** Hard  
**URL:** https://leetcode.com/problems/container-with-most-water/  

## Explanation

This problem is a classic example of a two-pointer technique. We start with two pointers, one at the beginning and one at the end of the array. We calculate the area of the water that can be formed by the two lines at the current positions. We then move the pointer that corresponds to the shorter line, because moving the other pointer will not increase the area. We repeat this process until the two pointers meet, and the maximum area is returned.