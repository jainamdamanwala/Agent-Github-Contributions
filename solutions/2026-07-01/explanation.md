# Longest Substring Without Repeating Characters

**ID:** 3  
**Difficulty:** Medium  
**URL:** https://leetcode.com/problems/longest-substring-without-repeating-characters/  

## Explanation

This problem can be solved using a sliding window approach with a set to keep track of unique characters in the current substring. The left pointer of the window is moved to the right when a repeating character is found, and the maximum length of the substring without repeating characters is updated accordingly.