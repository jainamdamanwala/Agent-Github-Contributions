# Container With Most Water

**ID:** 11  
**Difficulty:** Hard  
**URL:** https://leetcode.com/problems/container-with-most-water/  

## Explanation

This problem can be solved by using a two-pointer technique. We start with two pointers, one at the beginning and one at the end of the array. We calculate the area of the water that can be contained between the two lines and update the maximum area if necessary. We then move the pointer of the shorter line towards the other pointer, because moving the pointer of the taller line will not increase the area. This process continues until the two pointers meet.