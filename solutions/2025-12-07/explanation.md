# Container With Most Water

**ID:** 11  
**Difficulty:** Hard  
**URL:** https://leetcode.com/problems/container-with-most-water/  

## Explanation

This problem can be solved by using a two-pointer technique. We start by initializing two pointers, one at the beginning of the array and one at the end. We then calculate the area of the water that can be trapped between the two lines and update our maximum area if necessary. We then move the pointer that corresponds to the shorter line towards the other pointer, because the area of the water that can be trapped is limited by the shorter line. We repeat this process until the two pointers meet.