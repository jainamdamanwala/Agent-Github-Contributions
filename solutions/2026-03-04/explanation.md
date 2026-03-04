# Longest Common Prefix

**ID:** 14  
**Difficulty:** Easy  
**URL:** https://leetcode.com/problems/longest-common-prefix/  

## Explanation

The problem can be solved by first finding the minimum and maximum strings in the array. Then we iterate over the characters of the minimum and maximum strings. If we find a mismatch, we return the common prefix up to the mismatch. If we don't find any mismatch, we return the entire minimum string as it is the longest common prefix.