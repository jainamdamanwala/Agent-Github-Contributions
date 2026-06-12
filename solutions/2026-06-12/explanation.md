# Longest Common Prefix

**ID:** 14  
**Difficulty:** Easy  
**URL:** https://leetcode.com/problems/longest-common-prefix/  

## Explanation

This problem can be solved by first finding the shortest string in the array, as the longest common prefix cannot be longer than the shortest string. Then, we iterate over each character in the shortest string, checking if it is the same in all other strings. If we find a mismatch, we return the common prefix up to the current position. If we make it through the entire shortest string without finding a mismatch, we return the entire shortest string as the longest common prefix.