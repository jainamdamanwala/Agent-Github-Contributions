# Container With Most Water

**ID:** 11  
**Difficulty:** Hard  
**URL:** https://leetcode.com/problems/container-with-most-water/  

## Explanation

This problem can be solved by using a two-pointer technique. We start by initializing two pointers, one at the beginning and one at the end of the array. We then calculate the area of the container that can be formed by the two lines at the current positions. We update the maximum area if the current area is larger. We then move the pointer of the shorter line towards the other pointer, because the area of the container is determined by the height of the shorter line. This way, we can ensure that we are always considering the maximum possible area.