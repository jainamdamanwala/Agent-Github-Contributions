# Longest Substring Without Repeating Characters

**ID:** 3  
**Difficulty:** Medium  
**URL:** https://leetcode.com/problems/longest-substring-without-repeating-characters/  

## Explanation

This problem can be solved using a sliding window approach with a set to keep track of unique characters in the current substring. The left pointer of the window is used to remove characters from the set when a repeating character is found, and the right pointer is used to add new characters to the set.