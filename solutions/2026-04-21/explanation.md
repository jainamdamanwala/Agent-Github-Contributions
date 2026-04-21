# First Missing Positive

**ID:** 41  
**Difficulty:** Medium  
**URL:** https://leetcode.com/problems/first-missing-positive/  

## Explanation

This problem can be solved by first checking if the input array is empty. If it is, the first missing positive integer is 1. Otherwise, we convert the array to a set for efficient lookups. Then we iterate over the range from 1 to the length of the array plus one. If we find a number that is not in the set, we return it as the first missing positive integer. If we don't find any such number, it means that all numbers from 1 to the length of the array are present in the array, so we return the length of the array plus one.