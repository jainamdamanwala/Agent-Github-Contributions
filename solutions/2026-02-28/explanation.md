# Minimum Window Substring

**ID:** 76  
**Difficulty:** Hard  
**URL:** https://leetcode.com/problems/minimum-window-substring/  

## Explanation

This solution uses the sliding window technique to find the minimum window substring. It maintains two pointers, left and right, which represent the start and end of the current window. It also uses a map to store the count of characters in the window and the target string. The algorithm iterates over the string, expanding the window to the right and contracting it from the left when the window contains all the characters of the target string.