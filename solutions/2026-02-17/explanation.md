# Container With Most Water

**ID:** 11  
**Difficulty:** Hard  
**URL:** https://leetcode.com/problems/container-with-most-water/  

## Explanation

This problem can be solved using a two-pointer technique. We start with two pointers at the beginning and end of the array. We calculate the area of water that can be formed between the two lines at the current positions of the pointers. We update the maximum area if the current area is greater. We then move the pointer that corresponds to the shorter line towards the other pointer, because the area of water is determined by the shorter line.