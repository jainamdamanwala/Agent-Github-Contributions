# Container With Most Water

**ID:** 11  
**Difficulty:** Hard  
**URL:** https://leetcode.com/problems/container-with-most-water/  

## Explanation

The two-pointer technique is used to solve this problem. We start with two pointers, one at the beginning and one at the end of the array. We calculate the area between the two lines and update the maximum area if necessary. We then move the pointer of the shorter line towards the other pointer. This is because the area between the two lines is determined by the height of the shorter line, so moving the pointer of the shorter line will not decrease the area. We repeat this process until the two pointers meet.