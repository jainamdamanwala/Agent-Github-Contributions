# First Missing Positive

**ID:** 41  
**Difficulty:** Hard  
**URL:** https://leetcode.com/problems/first-missing-positive/  

## Explanation

This problem can be solved by using the concept of in-place hashing. We iterate over the array and for each element, we try to place it at its correct index. If the element is already at its correct index, we do nothing. If the element is not at its correct index, we swap it with the element at its correct index. After that, we iterate over the array again and return the first index that does not match its value.