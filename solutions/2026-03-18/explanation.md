# Container With Most Water

**ID:** 11  
**Difficulty:** Hard  
**URL:** https://leetcode.com/problems/container-with-most-water/  

## Explanation

The two-pointer technique is used to solve this problem. We start with two pointers, one at the beginning and one at the end of the array. We calculate the area of water that can be formed by the two lines and update the maximum area if necessary. We then move the pointer that corresponds to the shorter line towards the other pointer, because the area of water is determined by the height of the shorter line. This process continues until the two pointers meet.