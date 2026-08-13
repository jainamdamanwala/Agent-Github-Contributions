# Container With Most Water

**ID:** 11  
**Difficulty:** Medium  
**URL:** https://leetcode.com/problems/container-with-most-water/  

## Explanation

This problem can be solved using a two-pointer technique. We initialize two pointers, one at the beginning and one at the end of the array. We calculate the area of water that can be trapped between the two lines and update the maximum area if necessary. Then we move the pointer of the shorter line towards the other pointer until they meet.