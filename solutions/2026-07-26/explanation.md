# Container With Most Water

**ID:** 11  
**Difficulty:** Hard  
**URL:** https://leetcode.com/problems/container-with-most-water/  

## Explanation

The problem can be solved by using a two-pointer approach. We start with two pointers, one at the beginning and one at the end of the array. We calculate the area of the water that can be contained between the two lines and update the maximum area if necessary. We then move the pointer of the shorter line towards the other pointer. This is because moving the pointer of the shorter line will not decrease the area, as the height of the shorter line is the limiting factor.