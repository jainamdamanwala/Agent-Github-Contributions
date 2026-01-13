# Minimum Window Substring

**ID:** 76  
**Difficulty:** Hard  
**URL:** https://leetcode.com/problems/minimum-window-substring/  

## Explanation

This problem is a variation of the sliding window problem. We use two pointers, one for the window and one for the string t. We count the frequency of each character in string t and in the current window. If the frequency of each character in the window is greater than or equal to the frequency in string t, we add the start index of the window to the result list.