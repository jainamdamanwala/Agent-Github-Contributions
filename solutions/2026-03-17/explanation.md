# Longest Common Prefix

**ID:** 14  
**Difficulty:** Easy  
**URL:** https://leetcode.com/problems/longest-common-prefix/  

## Explanation

This problem can be solved by iterating over the characters of the shortest string in the list. We iterate over each character in the shortest string and check if it is the same in all other strings. If we find a character that is different, we return the prefix up to that point. If we get through the entire shortest string without finding a different character, we return the entire shortest string as the longest common prefix.