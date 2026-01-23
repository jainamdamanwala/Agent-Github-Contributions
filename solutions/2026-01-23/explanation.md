# Longest Substring Without Repeating Characters

**ID:** 3  
**Difficulty:** Medium  
**URL:** https://leetcode.com/problems/longest-substring-without-repeating-characters/  

## Explanation

This problem can be solved using the sliding window technique. We maintain a set of characters in the current window and move the left pointer to the right when a repeating character is found. The maximum length of the substring without repeating characters is updated at each step.