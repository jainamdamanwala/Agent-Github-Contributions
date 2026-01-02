# Longest Substring Without Repeating Characters

**ID:** 3  
**Difficulty:** Medium  
**URL:** https://leetcode.com/problems/longest-substring-without-repeating-characters/  

## Explanation

This problem can be solved by using a sliding window approach with a set to keep track of unique characters in the current substring.
We maintain two pointers, left and right, representing the start and end of the current substring.
When a repeating character is found, we move the left pointer to the right until the repeating character is removed from the set.
The maximum length of the substring without repeating characters is updated at each step.