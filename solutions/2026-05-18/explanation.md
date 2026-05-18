# Container With Most Water

**ID:** 11  
**Difficulty:** Hard  
**URL:** https://leetcode.com/problems/container-with-most-water/  

## Explanation

This problem can be solved by using a two-pointer technique. We start by initializing two pointers, one at the beginning and one at the end of the array. We calculate the area of the water that can be trapped between the two lines at the current positions of the pointers. We then move the pointer that corresponds to the shorter line towards the other pointer. This is because the area of the water that can be trapped is determined by the shorter line. We repeat this process until the two pointers meet, and the maximum area is returned.