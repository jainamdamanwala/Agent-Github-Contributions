# Container With Most Water

**ID:** 11  
**Difficulty:** Hard  
**URL:** https://leetcode.com/problems/container-with-most-water/  

## Explanation

This problem can be solved by using a two-pointer technique. We initialize two pointers, one at the start and one at the end of the array. We then calculate the area of water that can be contained between the two lines and update our maximum area if necessary. We move the pointer of the shorter line towards the other pointer, because the area is determined by the height of the shorter line.