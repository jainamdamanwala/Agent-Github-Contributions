# Container With Most Water

**ID:** 11  
**Difficulty:** Hard  
**URL:** https://leetcode.com/problems/container-with-most-water/  

## Explanation

This problem can be solved using a two-pointer technique. First, we sort the boxes based on their heights. Then, we initialize two pointers, one at the start and one at the end of the array. We move the pointer of the smaller box towards the larger box until they are equal. The maximum area is updated at each step.