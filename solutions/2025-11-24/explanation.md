# Minimum Window Substring

**ID:** 76  
**Difficulty:** Hard  
**URL:** https://leetcode.com/problems/minimum-window-substring/  

## Explanation

This problem can be solved using the sliding window technique. We maintain a count of characters in string t and slide a window over string s. We expand the window to the right until we have all characters of t in the window, then we try to shrink the window from the left until we no longer have all characters of t in the window. The minimum window is the one with the smallest length that still contains all characters of t.