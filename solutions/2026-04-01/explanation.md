# Container With Most Water

**ID:** 11  
**Difficulty:** Hard  
**URL:** https://leetcode.com/problems/container-with-most-water/  

## Explanation

This problem can be solved by using a two-pointer approach. We start with two pointers, one at the beginning and one at the end of the array. We calculate the area of the water that can be contained between the two lines at the current positions. We then move the pointer of the shorter line towards the other pointer. This is because moving the pointer of the shorter line will not decrease the area, but moving the pointer of the taller line will increase the area. We repeat this process until the two pointers meet.