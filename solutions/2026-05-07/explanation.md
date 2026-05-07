# Longest Substring Without Repeating Characters

**ID:** 3  
**Difficulty:** Medium  
**URL:** https://leetcode.com/problems/longest-substring-without-repeating-characters/  

## Explanation

This problem can be solved using a sliding window approach with a set to keep track of unique characters. The set is used to check if a character is already present in the current substring. If it is, we slide the window to the right by removing characters from the left until the repeating character is removed from the set. The maximum length of the substring without repeating characters is updated at each step.