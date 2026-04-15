# Container With Most Water

**ID:** 11  
**Difficulty:** Hard  
**URL:** https://leetcode.com/problems/container-with-most-water/  

## Explanation

This problem can be solved using a two-pointer technique. We start with two pointers, one at the beginning and one at the end of the array. We calculate the area between the two pointers and update the maximum area if necessary. We then move the pointer that corresponds to the shorter height towards the other pointer. This is because the area between the two pointers is determined by the shorter height, so moving the pointer that corresponds to the shorter height will not decrease the area.