# Container With Most Water

**ID:** 11  
**Difficulty:** Hard  
**URL:** https://leetcode.com/problems/container-with-most-water/  

## Explanation

The two-pointer technique is used to solve this problem. We initialize two pointers, one at the start and one at the end of the array. We then calculate the area between the two lines and update the maximum area if necessary. We move the pointer of the shorter line towards the other pointer to maximize the area. This is because the area is determined by the height of the shorter line.