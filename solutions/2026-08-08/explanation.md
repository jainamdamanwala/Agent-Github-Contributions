# Minimum Window Substring

**ID:** 76  
**Difficulty:** Hard  
**URL:** https://leetcode.com/problems/minimum-window-substring/  

## Explanation

This solution uses a sliding window approach to find the minimum window substring. It maintains two pointers, left and right, to represent the current window. It also uses two maps, tCount and windowCounts, to keep track of the characters in the target string and the current window respectively. The time complexity is O(m*n) where m and n are the lengths of the input strings.